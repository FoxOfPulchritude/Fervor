package server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MultiCastServerThread extends Thread {
	static int count = 0;
	private static final int PORT = 4607;
	protected DatagramSocket socket = null;
	private static final DatagramPacket WAKE_PACKET = WakePacket.packet();
	
	public MultiCastServerThread() throws IOException{
		super("Recieving Que Thread");
		socket = new DatagramSocket(PORT);
	}
	//Change default MESSAGE, LISTEN PORT, LISTEN PACKET
	@Override
	public void run() {
		while(true) {
			try {
				DatagramPacket packet = WAKE_PACKET;
				socket.receive(packet);
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				MultiCastServer.que.add(new TaskMap(address,new TestTask(),port));
			}catch(IOException e) {
				e.printStackTrace();
		}	
	}
}
}
