package PL;

public class PayPalPayment implements PaymentMethod {
	public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal..!");
    }
}
