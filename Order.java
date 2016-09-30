/* Caspar Arbeeny cma85 
 * A class that represents an order for a stock. The Order has a trader making a stock, a stock symbol, a price, 
 * a number of shares being traded, and a indicator whether you need to trade all of the stocks or only some of them.
*/
public class Order extends Object {
 
  // Stores the symbol of the stock being traded.
  private final char stockSymbol;
  
  // Stores the number of shares in the order.
  private int shares;
  
  // Stores the price of the stock
  private double price;
  
  // Stores whether or not we can only trade all of the shares of the order.
  private boolean allOrNone;
 
  // Stores the location in memory of the trader conducting the order.
  private Trader trader;
  
  // A constructor for the class that requires 5 inputs that set all of the above variables. 
  public Order(char stockSymbol, int shares, double price, boolean allOrNone, String trader) {
   this.trader = new Trader(trader);
   this.stockSymbol = stockSymbol;
   setNumberShares(shares);
   setPrice(price);
   setAllOrNone(allOrNone);
  }
  
  // Takes no input and returns the symbol of the stock being traded
  public char getStockSymbol() {
    return this.stockSymbol;
  }
 
  // Takes no input and returns the number of shares being traded
  public int getNumberShares() {
    return this.shares;
  }
 
  // Takes an int and sets the number of shares being traded
  public void setNumberShares(int shares) {
    this.shares = shares;
  }
  
  // Takes no input and returnns the price of the stock
  public double getPrice() {
    return this.price; 
  }
  
  // Takes a double and sets that as the price of  the stock
  public void setPrice(double price) {
    this.price = price;
  }
  
  //  Takes no input and returns if all the sharse a stock neede to be traded
  public boolean getAllOrNone() {
    return this.allOrNone;
  }
  
  // Takes a boolean and sets if all the shares of a stock need to be traded
  public void setAllOrNone(boolean allOrNone) {
    this.allOrNone = allOrNone;
  }
  
  // 
  public Trader getTrader() {
    return this.trader;
  }
}