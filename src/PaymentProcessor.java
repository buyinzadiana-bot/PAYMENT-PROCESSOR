public class PaymentProcessor {

    // Process Credit Card payment
    public void processPayment(CreditCard card) {
        System.out.println("Processing Credit Card payment...");
        System.out.println("Card Number: " + card.getCardNumber());
    }

    // Process PayPal payment
    public void processPayment(PayPal paypal) {
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal Email: " + paypal.getEmail());
    }

    // Process Bitcoin payment (NEW)
    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin payment...");
        System.out.println("Wallet Address: " + bitcoin.getWalletAddress());
    }
}
