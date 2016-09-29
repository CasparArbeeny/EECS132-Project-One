public class BuyOrder extends Order {

  public BuyOrder(char stockSymbol, int shares, double price, boolean allOrNone, String trader) {
  super(stockSymbol, shares, price, allOrNone, trader);
  }
}