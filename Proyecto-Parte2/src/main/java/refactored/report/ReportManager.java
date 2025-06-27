package refactored.report;

import refactored.constants.ReportMessages;
import refactored.interfaces.ILogger;

public class ReportManager {
    private final ILogger logger;
    private String reportContent;

    public ReportManager(ILogger logger) {
        this.logger = logger;
    }

    public void setReport(String reportContent) {
        this.reportContent = reportContent;
    }

    public void processReport() {
        printReport();
        emailReport();
        saveReport();
    }

    private void printReport() {
        logger.log(ReportMessages.PROCESSING + reportContent);
    }

    private void emailReport() {
        logger.log(ReportMessages.SENDING_EMAIL + reportContent);
    }

    private void saveReport() {
        logger.log(ReportMessages.SAVING + reportContent);
    }
}