package PL;

public class PayPalFactory implements PaymentMethodFactory {
	public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}
