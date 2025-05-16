package org.howtodoitinjava.dependencyInjection.problemCode;

public class NotificationManager {

    private final EmailNotificationService emailService = new EmailNotificationService();

    public void notify(String message) {
        emailService.sendNotification(message);
    }

}
