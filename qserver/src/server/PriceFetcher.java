package server;

public class PriceFetcher implements Fetcher{
	private String onlineServer;
	
	public PriceFetcher(String url) {
		onlineServer = url;
	}
	@Override
	public void fetch() {
		
	}
	@Override
	public void push() {
		
	}
}
