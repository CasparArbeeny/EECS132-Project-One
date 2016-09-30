public class Transaction extends Order {

  public Transaction(char stockSymbol, int shares, double price, Trader buyer, Trader seller, Market market ) {
    super(stockSymbol, shares, price, false, null)
  
  }
 

}