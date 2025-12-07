package RoboMQ;

/**
 * Interface representing a Load Balancer.
 * Provides methods to add/remove servers and select the next server.
 */
public interface LoadBalancer {

    /**
     * Adds a new server to the load balancer.
     * Returns true if server is added successfully, false if not able to add server
     * Logs the name of the server added. 
     * @param serverName the name of the server to add
     */
    boolean addServer(Server serverName);

    /**
     * Removes a server from the load balancer.
     * Returns true if removal was successfull, false if not able to remove server.
     * Logs the name of the server remvoved.
     * @param serverName the name of the server to remove
     */
    boolean removeServer(Server serverName);

    /**
     * Returns the name of the next server selected for handling a request.
     *
     * @return the selected server's name
     */
    Server getNextServer();
}
