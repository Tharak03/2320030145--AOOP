package PL;

public class CreditCardFactory  implements PaymentMethodFactory {
	public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}
