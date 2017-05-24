package client;

import java.util.*;
import java.net.*;
import java.io.*;

public class Reciever {
	
	protected static InetAddress LOCALHOST;
	protected static InetAddress server;
	
	public static void main(String[] args) throws IOException{
		//try{
			LOCALHOST = InetAddress.getLocalHost();
			server = InetAddress.getByName("10.0.0.41");
			sendReply(256, 4607);
			sendReply(250, 4617);
			sendReply(249,4618);
			sendReply(251, 4609);
			sendReply(252, 4610);
			
		//}
		
		
	}
	private static void sendReply(int pID, int port) throws IOException{
		DatagramSocket socket = new DatagramSocket(4608);
		byte[] wake = new byte[pID];
		DatagramPacket packet = new DatagramPacket(wake,wake.length,LOCALHOST,port);
		socket.send(packet);
		packet = new DatagramPacket(wake, wake.length);
		socket.receive(packet);
		String data = new String(packet.getData(), 0, packet.getLength());
		System.out.println(data);
		socket.close();
	}
}
