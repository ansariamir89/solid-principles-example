package org.howtodoitinjava.singleResponsibility.refactoredCode;

public class EmailService {

    public void sendEmail(String recipient, String subject, String body) {
        // Email sending logic goes here
        System.out.println("Email sent to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

}
