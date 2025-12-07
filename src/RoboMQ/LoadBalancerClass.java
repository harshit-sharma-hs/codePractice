//package RoboMQ;
//
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//public class LoadBalancerClass implements LoadBalancer{
//    List<Server> list = new CopyOnWriteArrayList<>();
//    @Override
//    public boolean addServer(Server serverName) {
//       return list.add(serverName);
//    }
//
//    @Override
//    public boolean removeServer(Server serverName) {
//        return list.remove(serverName);
//    }
//
//    @Override
//    public Server getNextServer() {
//        Server server = null;
//        int randomSelctect = 10000 + (int)(Math.random() * 20000);
//        if(randomSelctect>150000)
//            server=list.get(0);
//        else
//            server=list.get(1);
//        return server;
//    }
//
//
//}
package RoboMQ;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class LoadBalancerClass implements LoadBalancer {
    List<Server> list = new CopyOnWriteArrayList<>();
    private final AtomicInteger index = new AtomicInteger(0);
    private Mode mode = Mode.ROUND_ROBIN; // default strategy

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @Override
    public boolean addServer(Server server) {
        return list.add(server);
    }

    @Override
    public boolean removeServer(Server server) {
        return list.remove(server);
    }

    @Override
    public Server getNextServer() {
        if (list.isEmpty()) {
            System.out.println("No servers available!");
            return null;
        }
        if (mode == Mode.RANDOM) {
            int randomIndex = (int) (Math.random() * list.size());
            return list.get(randomIndex);
        } else { // ROUND_ROBIN
            int i = Math.abs(index.getAndIncrement() % list.size());
            return list.get(i);
        }
    }
}
