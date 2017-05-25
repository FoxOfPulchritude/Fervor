package server;

public class TestTask implements Task{

	public TestTask() {
		
	}
	
	@Override
	public void runTask() {
		System.out.println("Test Task");
	}

}
