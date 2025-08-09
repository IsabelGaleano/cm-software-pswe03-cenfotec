package org.example.Strategy_Calculator;

public class Division implements Operation {
    public double execute(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
