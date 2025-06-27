package refactored.order;

import refactored.interfaces.ILogger;

public class OrderPrinter {
    private final ILogger logger;

    public OrderPrinter(ILogger logger) {
        this.logger = logger;
    }

    public void printSummary(OrderSummary summary) {
        logger.log(String.format(
                "Amount: %.2f\nTax: %.2f\nService Fee: %.2f\nDiscount: %.2f\nTotal: %.2f\n",
                summary.amount, summary.tax, summary.serviceFee, summary.discount, summary.total));
    }
}