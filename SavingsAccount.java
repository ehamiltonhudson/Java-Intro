public class SavingsAccount {

  int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  //Check balance:
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);
  }

  //Deposit:
  public void deposit(int amountToDeposit) {
    int afterDeposit = balance + amountToDeposit;
    balance = afterDeposit;
    System.out.println("You just deposited "+amountToDeposit);
  }

  //Withdrawing:
  public int withdraw(int amountToWithdraw) {
    int afterWithdraw = balance - amountToWithdraw;
    balance = afterWithdraw;
    System.out.println("You just withdrew "+amountToWithdraw);
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    // Withdrawing:
    savings.withdraw(300);

    // Check balance:
    savings.checkBalance();

    // Deposit:
    savings.deposit(600);

    // Check balance:
    savings.checkBalance();

    // Deposit:
    savings.deposit(600);

    // Check balance:
    savings.checkBalance();

    System.out.println(savings);
  }

  public String toString() {
    return "Your final balance is " +balance;
  }

}
