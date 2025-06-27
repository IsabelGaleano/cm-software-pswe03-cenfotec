// src/Main.java
package refactored;

import refactored.db.DBConnection;
import refactored.order.OrderCalculator;
import refactored.order.OrderPrinter;
import refactored.order.OrderSummary;
import refactored.report.ReportManager;
import refactored.user.UserHandler;
import refactored.user.UserValidator;
import refactored.utils.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        // Test DB class / Probar clase DB
        DBConnection db = new DBConnection(logger);
        db.connect("CustomerDB");
        db.query("SELECT * FROM orders");
        db.disconnect("CustomerDB");

        System.out.println();

        // Test OrderProcessor class / Probar clase OrderProcessor
        OrderCalculator calculator = new OrderCalculator();
        OrderPrinter printer = new OrderPrinter(logger);

        OrderSummary summary1 = new OrderSummary(
                120.00,
                calculator.calculateTax(120.00),
                calculator.calculateServiceFee(120.00),
                calculator.calculateDiscount(120.00),
                calculator.calculateTotal(120.00));
        printer.printSummary(summary1);

        System.out.println();

        OrderSummary summary2 = new OrderSummary(
                600.00,
                calculator.calculateTax(600.00),
                calculator.calculateServiceFee(600.00),
                calculator.calculateDiscount(600.00),
                calculator.calculateTotal(600.00));
        printer.printSummary(summary2);

        System.out.println();

        // Test ReportManager class / Probar clase ReportManager
        ReportManager report = new ReportManager(logger);
        report.setReport("Monthly Sales Report");
        report.processReport();

        System.out.println();

        // Test UserHandler class / Probar clase UserHandler
        UserHandler userHandler = new UserHandler(logger, new UserValidator());
        userHandler.process("Alice");
        userHandler.notifyUser("Alice");
        userHandler.printUser("Alice");

        System.out.println();

        // Test UserHandler with empty name / Probar UserHandler con nombre vacío
        userHandler.process("");
        userHandler.notifyUser(null);
        userHandler.printUser("");
    }
}