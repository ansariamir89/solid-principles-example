package org.howtodoitinjava.dependencyInjection.refactoredCode;

public class NotificationManager {

    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message) {
        notificationService.sendNotification(message);
    }
}
