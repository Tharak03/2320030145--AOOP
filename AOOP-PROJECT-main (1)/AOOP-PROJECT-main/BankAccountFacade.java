 
public class BankAccountFacade {
    private int accountNumber;
    private double balance;

    public BankAccountFacade(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void openAccount() {
        System.out.println("Account " + accountNumber + " opened.");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Current balance: " + balance);
    }

    public double getBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Current balance: " + balance);
        }
    }
}
