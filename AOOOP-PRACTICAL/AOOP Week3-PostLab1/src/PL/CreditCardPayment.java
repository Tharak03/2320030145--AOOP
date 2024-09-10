package PL;

public class CreditCardPayment implements PaymentMethod  {
	public void pay(double amount) {
        System.out.println("Paid $" + amount + " using a credit card..!");
    }
}
