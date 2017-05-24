package client;

public class Channel {
	private static int count = 0;
	private final int[] PORTS;
	private static final int[] DEFAULT_PORT = {4608,4609,4610,4611,4612,4613,4614,4615,4616};
	private int id;
	
	public Channel(int[] ports) {
		PORTS = ports;
		id = this.count;
		count++;
	}
	public Channel() {
		this(DEFAULT_PORT);
	}
	public int getID() {
		return id;
	}
}
