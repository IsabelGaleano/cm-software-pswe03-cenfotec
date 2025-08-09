package org.example.Strategy_Calculator;

import org.example.Logger.ConsoleLogger;
import org.example.Logger.Logger;

public class MainStrategy {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        Calculator calc = new Calculator(logger);

        // Suma
        calc.setOperation(new Addition());
        calc.calculate(5, 3); // imprime: Result: 8.0

        // Resta
        calc.setOperation(new Subtraction());
        calc.calculate(10, 4); // imprime: Result: 6.0

        // Multiplicación
        calc.setOperation(new Multiplication());
        calc.calculate(6, 7); // imprime: Result: 42.0

        // División
        calc.setOperation(new Division());
        calc.calculate(10, 4); // imprime: Result: 3.3333333...
    }
}
