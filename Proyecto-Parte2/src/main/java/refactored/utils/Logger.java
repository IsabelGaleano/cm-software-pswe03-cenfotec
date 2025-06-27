package refactored.utils;

import refactored.interfaces.ILogger;

public class Logger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
