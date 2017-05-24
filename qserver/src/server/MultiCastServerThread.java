package server;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiCastServerThread extends Thread {
	static int count = 0;
	protected DatagramSocket socket = null;
	private String message;
	private int pid;
	
	public MultiCastServerThread() throws IOException{
		this("Server Thread");
	}
	public MultiCastServerThread(String name) throws IOException{
		this(name, 4607);
	}
	public MultiCastServerThread(String name, int port) throws IOException {
		this(name,port,"Hello Person #" + count,256);
	}
	public MultiCastServerThread(String name, int port, String message) throws IOException{
		this(name,port,message,256);
	}
	public MultiCastServerThread(String name, int port, String message, int packetID) throws IOException{
		super(name);
		socket = new DatagramSocket(port);
		this.message = message;
		this.pid = packetID;
	}
	//Change default MESSAGE, LISTEN PORT, LISTEN PACKET
	@Override
	public void run() {
		while(true) {
			try {
				count++;
			byte[] b = new byte[pid];
			DatagramPacket packet = new DatagramPacket(b,b.length);
			socket.receive(packet);
			 b = this.message.getBytes();
			 InetAddress address = packet.getAddress();
			 int port = packet.getPort();
			 packet = new DatagramPacket(b,b.length,address,port);
			 socket.send(packet);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
