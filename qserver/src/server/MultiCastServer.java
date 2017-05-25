package server;

import java.io.IOException;
import java.net.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;

public class MultiCastServer {

	static ConcurrentLinkedQueue<TaskMap> que = new ConcurrentLinkedQueue<>();

	public static void main(String[] args) {
		MultiCastServerThread reciever = null;
		try {
			reciever = new MultiCastServerThread();
			reciever.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		while(true)
			options(sc);
	}
	static void options(Scanner sc) {
		
		System.out.println("Enter a command or -h for help");
		String comm = sc.nextLine();
		
			if(comm.equals("-tasks")) {
				System.out.println("Tasks queued: " + que.size());
			}
			else if(comm.equals("-exit")) {
				System.exit(0);
			}
			
		
	}
	

}
