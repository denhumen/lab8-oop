package ua.edu.ucu.apps.demo.flowerstore.payments;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        return true;
    }
}
