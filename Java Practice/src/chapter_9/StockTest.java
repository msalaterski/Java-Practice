package chapter_9;

import java.text.DecimalFormat;

public class StockTest {

	public static void main(String[] args) {
		// Declare and initialize Oracle Stock
		Stock oracle = new Stock("ORCL", "Oracle Corporation");
		oracle.currentPrice = 34.5;
		oracle.previousClosingPrice = 34.35;
		
		// Calculate percent change in Oracle's stock price
		DecimalFormat df = new DecimalFormat("0.00%");
		System.out.println("The percent change in the stock price of " + oracle.getName() + " is " + df.format(oracle.getChangePercent()));
		
		
	}

}
