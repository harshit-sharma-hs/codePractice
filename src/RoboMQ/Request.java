package RoboMQ;

/**
 * Represents a client request to be processed by the load balancer.
 */
public class Request {
    private final int id;

    /**
     * Constructs a new Request.
     *
     * @param id   the unique ID of the request
     */
    public Request(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + '}';
    }
}
