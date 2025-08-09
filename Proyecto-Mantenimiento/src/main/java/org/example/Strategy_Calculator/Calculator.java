package org.example.Strategy_Calculator;

import org.example.Logger.Logger;

public class Calculator {
    private Operation operation;
    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        if (operation == null) throw new IllegalStateException("No operation set");
        double result = operation.execute(a, b);
        logger.log("Result: " + result);
        return result;
    }
}
