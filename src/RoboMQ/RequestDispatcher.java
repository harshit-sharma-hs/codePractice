package RoboMQ;

/**
 * Interface for dispatching client requests using a LoadBalancer.
 */
public interface RequestDispatcher {

    /**
     * Dispatches a request to an appropriate server.
     * User server.handle(request) to dispatch the request to the server.
     * @param request the request to dispatch
     */
    void dispatch(Request request);



    /**
     * Shuts down the dispatcher and releases any resources if needed.
     */
    void shutdown();
}
