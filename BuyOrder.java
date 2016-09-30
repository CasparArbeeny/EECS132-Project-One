/* Caspar Arbeeny cma85
 * A Class rhat does the same thing as the order class but represents the buying of an order.  */
public class BuyOrder extends Order {

  // A Constructor that calls the constructor from the parent class (Order) and inputs the proper variables and 
  // does nothing else
  public BuyOrder(char stockSymbol, int shares, double price, boolean allOrNone, String trader) {
  super(stockSymbol, shares, price, allOrNone, trader);
  }
}