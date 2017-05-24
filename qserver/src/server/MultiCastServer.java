package server;

import java.io.IOException;
import java.net.*;

public class MultiCastServer {
	
	public static void main(String[] args) {
		MultiCastServerThread first = null;
		MultiCastServerThread second = null;
		MultiCastServerThread third = null;
		MultiCastServerThread four = null;
		MultiCastServerThread five = null;
		try{
		first = new MultiCastServerThread("HelloWorld", 4607);
		second = new MultiCastServerThread("GoodyBye", 4617, "Goodbye.", 250);
		third = new MultiCastServerThread("3", 4618, "Third", 249);
		four = new MultiCastServerThread("Kill" , 4609, "GoGo", 251);
		five = new MultiCastServerThread("Over", 4610, "Over", 252);
		}catch(IOException e) {
			e.printStackTrace();
		}
		first.start();
		second.start();
		third.start();
		four.start();
		five.start();
	}
}
