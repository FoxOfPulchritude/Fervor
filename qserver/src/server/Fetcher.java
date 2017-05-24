package server;
/**
 * Used to fetch from an online source of data to be stored in the server side
 * @author markp
 *
 * 
 */
public interface Fetcher {
	/**
	 * fetches the online data
	 * @return returns the data wanted
	 */
	public void fetch();
	/**
	 * pushes the data to the server
	 * @return
	 */
	public void push();
	
}
