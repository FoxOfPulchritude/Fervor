package server;

import java.net.DatagramPacket;
/**
 * 
 * @author Mark Potocki
 *
 */
public class WakePacket {
	//Class fields
	private static final DatagramPacket WAKER = wakePacket();
	/**
	 * Creates a packet to send to the server to join the que
	 * @return The wakePacket, an empty byte array of size 256
	 */
	private static DatagramPacket wakePacket() {
		byte[] b = new byte[256];
		DatagramPacket wake = new DatagramPacket(b,b.length);
		return wake;
	}
	/**
	 * Access method to get the wake packet
	 * @return DatagramPacket designated to add clients to the que
	 */
	public static DatagramPacket packet() {
		return WAKER;
	}

}
