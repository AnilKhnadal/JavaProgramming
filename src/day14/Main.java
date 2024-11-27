package day14;

public class Main {
    public static void main(String[] args) {
        // You cannot create an object of the abstract class PaymentProcessor directly
        // PaymentProcessor payment = new PaymentProcessor();  // Error

        // Create objects of subclasses
        PaymentProcessor creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(150.75);  // Outputs: Processing credit card payment of amount: $150.75

        PaymentProcessor paypalPayment = new PaypalPayment();
        paypalPayment.processPayment(200.50);  // Outputs: Processing PayPal payment of amount: $200.50
    }
}
