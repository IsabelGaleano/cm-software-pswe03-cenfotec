package refactored.order;

import refactored.constants.OrderConstants;

public class OrderCalculator {
    public double calculateTax(double amount) {
        return amount * OrderConstants.TAX_RATE;
    }

    public double calculateServiceFee(double amount) {
        return amount > 100 ? amount * OrderConstants.SERVICE_FEE_RATE : OrderConstants.FIXED_SERVICE_FEE;
    }

    public double calculateDiscount(double amount) {
        return amount > OrderConstants.DISCOUNT_THRESHOLD ? OrderConstants.DISCOUNT_AMOUNT : 0;
    }

    public double calculateTotal(double amount) {
        double tax = calculateTax(amount);
        double serviceFee = calculateServiceFee(amount);
        double discount = calculateDiscount(amount);
        return amount + tax + serviceFee - discount;
    }
}