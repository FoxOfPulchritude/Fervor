package server;

import java.net.InetAddress;

import tasks.Task;

/**
 * 
 * @author Mark Potocki
 *
 * Stores the task wanted to perform as well as the IP and return port of requester
 */
public class TaskMap {
	private InetAddress sender;
	private Task request;
	private int port;

	/**
	 * 
	 * @param ip IP address of the task requester
	 * @param task Implementation of Task interface
	 * @param returnPort The port to return the task result to the client
	 */
	public TaskMap(InetAddress ip,Task task, int returnPort) {
		this.sender = ip;
		this.request = task;
		this.port = returnPort;
	}

	public InetAddress getSender() {
		return sender;
	}

	public Task getRequest() {
		return request;
	}
	
	public int getPort() {
		return port;
	}

	

}
