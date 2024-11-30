package AssignmentException;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = 100.0;
    }
    public void deposit(double amount) throws InvalidAmountException{
        System.out.println("Attempting deposit amount : ");
        if(amount<0){
            throw new InvalidAmountException("It is invalid amount");
        }
        System.out.println("Depositing amount " + amount + ".");
        balance+=amount;
        System.out.println("Then balance is = " + balance);
    }
    public void withdraw(double amount) throws InsufficientAmountException{
        if(amount==0 || amount>balance){
            throw new InsufficientAmountException("It is insufficient balance");
        }
        balance-=amount;
        System.out.println("Balance is now = " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
