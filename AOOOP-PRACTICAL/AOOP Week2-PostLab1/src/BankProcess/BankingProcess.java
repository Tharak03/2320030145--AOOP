package BankProcess;

public class BankingProcess {
	private static BankingProcess instance;
    private boolean loggedIn;

    private BankingProcess() {
    }

    public static synchronized BankingProcess getInstance() {
        if (instance == null) {
            instance = new BankingProcess();
        }
        return instance;
    }

    public void login(String username, String password) {
        loggedIn = true;
    }

    public void logout() {
        loggedIn = false;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void viewBalance() {
        if (isLoggedIn()) {
            System.out.println("Balance: $1000");
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    public void deposit(double amount) {
        if (isLoggedIn()) {
            System.out.println("$" + amount + " deposit successfully.");
        } else {
            System.out.println("Please log in to make a deposit.");
        }
    }

    public void withdraw(double amount) {
        if (isLoggedIn()) {
            System.out.println("$" + amount + " withdraw successfully.");
        } else {
            System.out.println("Please log in to make a withdrawal.");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingProcess bankingProcess = BankingProcess.getInstance();
        bankingProcess.login("username", "password");

        bankingProcess.viewBalance();
        bankingProcess.deposit(200.0);
        bankingProcess.withdraw(100.0);
	}

}

