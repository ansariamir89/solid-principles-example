package org.howtodoitinjava.dependencyInjection.refactoredCode;

public class SmsNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        //send sms logic
    }
}
