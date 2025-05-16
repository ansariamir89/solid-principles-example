package org.howtodoitinjava.openClose.refactoredCode;

public class GPayPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Gpay.");
    }
}
