package org.example.State_TCP;

import org.example.Logger.ConsoleLogger;
import org.example.Logger.Logger;

public class MainState {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        TCPConnection connection = new TCPConnection(logger);
        connection.open();   // Opening connection...
        connection.open();   // Already open.
        connection.close();  // Closing connection...
        connection.close();  // Already closed.
    }
}
