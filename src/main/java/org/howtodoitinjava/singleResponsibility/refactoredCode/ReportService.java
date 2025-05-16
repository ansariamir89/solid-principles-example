package org.howtodoitinjava.singleResponsibility.refactoredCode;

public class ReportService {

    public void generateReport(String reportName, String username) {
        System.out.println("Generating report for user: " + username + "with title: " + reportName);
    }

}
