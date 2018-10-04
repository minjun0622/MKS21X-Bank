public class Driver {
  public static void main(String[] args) {
    BankAccount a = new BankAccount(499584, 3000.0, "password");
    System.out.println(a.getBalance());
    System.out.println(a.getAccountID());
    System.out.println(a.toString());
    a.setPassword("hola");
    

    if (a.deposit(-451.1)) {
      System.out.println("Withdrawl success!");
    }
    else {System.out.println("Deposit failure");
  }
  System.out.println(a.getBalance());


  if (a.withdraw(2049)) {
    System.out.println("Withdrawl success!");
  }
  else {System.out.println("Withdrawl failure");
}
System.out.println(a.getBalance());
}
}
