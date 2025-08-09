package org.example.Template_Beverage;

import org.example.Logger.ConsoleLogger;
import org.example.Logger.Logger;

public class MainTemplate {
    public static void main(String[] args) {
        Logger newLogger = new ConsoleLogger();
        Beverage tea = new Tea(newLogger);
        tea.prepare();

        newLogger.log("--------------------");

        Beverage coffee = new Coffee(newLogger);
        coffee.prepare();
    }
}
