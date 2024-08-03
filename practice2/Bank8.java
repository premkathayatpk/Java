class Bank{
    static int nextAccountNum=1001;
    double balance;
    public Bank(){
        this.balance=0.0;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount+ " ,New balance is "+balance);
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance-=amount;
            System.out.println("Deposited: "+amount+ " ,New balance is "+balance);
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public static int getNextAccountNum(){
        return nextAccountNum;
    }
    public static void incrementAccountNum(){
        nextAccountNum++;
    }
}

class Account extends Bank{
    int acc_no;

  public Account(){
      super();
      this.acc_no=Account.generateAccountNum();
  }
  public static int generateAccountNum(){
      int acc_no=Bank.getNextAccountNum();
      Bank.incrementAccountNum();
      return acc_no;
  }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + acc_no + ", Balance: " + balance);
    }
}

public class Bank8
{
    public static void main(String[] args) {
        Account a=new Account();
        a.deposit(20000);
        a.deposit(5000);
        a.displayAccountDetails();
        a.withdraw(10000);
        System.out.println(" ");
        Account account2 = new Account();
        account2.deposit(1000);
        account2.withdraw(300);
        account2.displayAccountDetails();
    }
}
