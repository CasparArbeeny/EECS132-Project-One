

public class Trader extends  Object {
  
  // Stores the name of the trader
  private String name;
  
  // Stores the amount of money the trader has access to.
  private double balance;
 
  // A constructor that takes a single string and sets it as the trader's name.
  public Trader(String name) {
    setName(name);
  }
  
  // Takes no inputs and returns the name of the Trader. 
  public String getName() {
    return this.name;
  }
  // Takes a String and changes the name of the Trader to that string. 
  public void setName(String  name) {
    this.name = name;
  }
  // Takes no input and returns the balance of the Trader.
  public double getBalance() {
    return this.balance;
  }
  // Takes a double and subtracts that value from the trader's balance.
  public void withdraw(double withdrawl) {
    this.balance = this.balance - withdrawl;
  }
  // Takes a double and adds that value to the trader's balance.
  public void deposit(double deposit) {
    this.balance = this.balance + deposit;
  }
}

