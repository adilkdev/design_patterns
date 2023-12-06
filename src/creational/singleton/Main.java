package creational.singleton;

public class Main {

    public static void main(String[] ar) {
        PaymentGatewayManager paymentGatewayManager = PaymentGatewayManager.getInstance();
        paymentGatewayManager.processPayment(100);
    }

}
