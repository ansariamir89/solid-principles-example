package org.howtodoitinjava.openClose.problemCode;

public class PaymentProcessor {

    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Paid " + amount + " using Credit Card.");
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Paid " + amount + " using PayPal.");
        } else {
            System.out.println("Invalid payment type.");
        }
    }

}
