public class Main {
    public static void main(String[] args) {
        // Demonstrating BankAccountFacade functionality
        System.out.println("=== Bank Account Operations ===");
        BankAccountFacade bankAccount = new BankAccountFacade(123456);
        bankAccount.openAccount();
        bankAccount.deposit(500.0);
        bankAccount.getBalance();
        bankAccount.withdraw(200.0);
        bankAccount.getBalance();

        System.out.println();

        // Demonstrating OnlineShoppingCart functionality
        System.out.println("=== Online Shopping Cart Operations ===");
        OnlineShoppingCart cart = new OnlineShoppingCart();
        cart.addProduct("Laptop");
        cart.addProduct("Smartphone");
        cart.removeProduct("Smartphone");
        cart.checkout();
    }
}

