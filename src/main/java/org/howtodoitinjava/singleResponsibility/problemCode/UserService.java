package org.howtodoitinjava.singleResponsibility.problemCode;

// Class that violates the Single Responsibility Principle
public class UserService {

    public boolean authenticate(String username, String password) {
        // Authentication logic goes here
        // For simplicity, let's assume it always returns true
        return true;
    }

    public void sendEmail(String recipient, String subject, String body) {
        // Email sending logic goes here
        System.out.println("Email sent to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

    public void generateReport(String reportName, String username) {
        System.out.println("Generating report for user: " + username + "with title: " + reportName);
    }
}