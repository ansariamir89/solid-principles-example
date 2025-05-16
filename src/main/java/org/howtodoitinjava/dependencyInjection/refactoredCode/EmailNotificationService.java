package org.howtodoitinjava.dependencyInjection.refactoredCode;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}
