package RoboMQ;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RequestDispatcherClass implements RequestDispatcher{

    ExecutorService ex = Executors.newFixedThreadPool(2);
    LoadBalancerClass loadBalancerClass;

    RequestDispatcherClass(LoadBalancerClass loadBalancerClass)
    {
        this.loadBalancerClass=loadBalancerClass;
    }

    @Override
    public void dispatch(Request request) {
        ex.submit(()->{
            Server s1 = loadBalancerClass.getNextServer();
            s1.handle(request);
        });
    }

    @Override
    public void shutdown() {
        ex.shutdown();
    }

}
