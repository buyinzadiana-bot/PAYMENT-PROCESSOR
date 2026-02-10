public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        CreditCard card = new CreditCard("1234-5678-9012");
        PayPal paypal = new PayPal("user@example.com");
        Bitcoin bitcoin = new Bitcoin("bc1qxy2kgdygjrsqtzq2n0yrf2493p83kkfjhx0wlh");

        processor.processPayment(card);
        System.out.println();

        processor.processPayment(paypal);
        System.out.println();

        processor.processPayment(bitcoin);
    }
}
