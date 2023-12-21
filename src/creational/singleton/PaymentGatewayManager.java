package creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PaymentGatewayManager {
    private static PaymentGatewayManager instance;
    private static final Lock mtx = new ReentrantLock();

    private PaymentGatewayManager() {
        System.out.println("PaymentGatewayManger initialised");
    }

    public static PaymentGatewayManager getInstance() {
        if (instance == null) { // First check without locking
            mtx.lock(); // Acquire the lock before creating the instance
            try {
                if (instance == null)  // Double-checked locking
                    instance = new PaymentGatewayManager();
            } finally {
                mtx.unlock();
            }
        }
        return instance;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through the payment gateway.");
    }
}
