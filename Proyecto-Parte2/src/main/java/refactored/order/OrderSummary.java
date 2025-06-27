// src/refactored/order/OrderSummary.java
package refactored.order;

public class OrderSummary {
    public final double amount;
    public final double tax;
    public final double serviceFee;
    public final double discount;
    public final double total;

    public OrderSummary(double amount, double tax, double serviceFee, double discount, double total) {
        this.amount = amount;
        this.tax = tax;
        this.serviceFee = serviceFee;
        this.discount = discount;
        this.total = total;
    }
}
