package server;

/**
 * 
 * @author Mark Potocki
 *
 */
@Deprecated
public class Stock {
	//private final String name;
	private final String symbol;
	private float price;
	
	public Stock(String symbol) {
		this.symbol = symbol.toUpperCase();
	}
	
	private float getPrice() {
		throw new UnsupportedOperationException();
	}
	private String getName() {
		throw new UnsupportedOperationException();
	}
}
