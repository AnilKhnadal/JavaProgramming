package day14;

//Abstract class with an abstract method
abstract class PaymentProcessor {
	// Abstract method to process payment (no implementation)
	abstract void processPayment(double amount);
}

//Subclass CreditCardPayment that implements the abstract method
class CreditCardPayment extends PaymentProcessor {
	@Override
	void processPayment(double amount) {
		System.out.println("Processing credit card payment of amount: $" + amount);
	}
}

//Subclass PaypalPayment that implements the abstract method
class PaypalPayment extends PaymentProcessor {
	@Override
	void processPayment(double amount) {
		System.out.println("Processing PayPal payment of amount: $" + amount);
	}
}
