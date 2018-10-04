public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int accountID, double balance, String password) {
  this.accountID = accountID;
  this.balance = balance;
  this.password = password;
}

  public String toString() {
  return accountID + "\t" + balance;
}

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newpass) {
    password = newpass;

  }

  public boolean deposit (double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
      }
      return false;
  }

  public boolean withdraw (double amount) {
    if (balance - amount >= 0) {
    balance = balance - amount;
    return true;
  }
  return false;
}





}
