package RoboMQ;

/**
 * Simulates a server that can handle requests.
 */
public class Server {
    private final String name;

    public Server(String name) {
        this.name = name;
    }

    /**
     * Simulates handling an incoming request with artificial delay
     * between 10 to 30 seconds.
     * Returns true if the request is processed successfully.
     *
     * @param request the request to process
     */
    public void handle(Request request) {
        System.out.println("Server " + name + " started processing request " +
            request.getId());

        try {
            // Simulate processing time between 10,000ms and 30,000ms
            int delay = 10000 + (int)(Math.random() * 20000);
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Server " + name + " was interrupted while processing.");
       //     return false;
        }

        System.out.println("Server " + name + " finished request " + request.getId());
     //   return true;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Server{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Server)) return false;
        Server other = (Server) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
