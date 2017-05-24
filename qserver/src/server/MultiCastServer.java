package server;

import java.io.IOException;
import java.net.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MultiCastServer {

	private static ConcurrentLinkedQueue<TaskMap> que = new ConcurrentLinkedQueue<>();

	public static void main(String[] args) {
		MultiCastServerThread reciever = null;
		try {
			reciever = new MultiCastServerThread(que);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
