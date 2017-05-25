package server;

import tasks.Task;

public class ServerTaskThread extends Thread {
	
	private static int count = 1;
	
	public ServerTaskThread() {
		super("Task Processor " + count);
		count++;
	}
	
	@Override
	public void run() {
		while(!MultiCastServer.que.isEmpty()) {
			
		}
	}
	
	private void doTask(Task t) {
		t.runTask();
	}
	private void reQueue() {
		throw new UnsupportedOperationException();
	}

}
