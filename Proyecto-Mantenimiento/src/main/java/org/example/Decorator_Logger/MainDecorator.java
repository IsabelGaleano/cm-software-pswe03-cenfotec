package org.example.Decorator_Logger;

import org.example.Logger.ConsoleLogger;
import org.example.Logger.Logger;

public class MainDecorator {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ServiceInterface service = new LoggingService(new BasicService(), logger);

        service.process();
        service.validate();
    }
}
