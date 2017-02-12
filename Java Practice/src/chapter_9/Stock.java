package chapter_9;

public class Stock {
	// Declare instance variables
	private String symbol;
	private String name;
	double previousClosingPrice;
	double currentPrice;
	
	// Construct a Stock object with a symbol and name
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	// Return the percent change in stock price
	double getChangePercent(){
		return ((currentPrice - previousClosingPrice) / previousClosingPrice);
	}
	// Return the stock name
	String getName(){
		return this.name;
	}
	
	// Return the stock symbol
	String getSymbol(){
		return this.symbol;
	}
}
