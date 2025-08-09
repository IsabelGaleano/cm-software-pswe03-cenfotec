package org.example.Facade_Travel;

import org.example.Logger.Logger;

public class Flight {
    private Logger logger;
    public Flight(Logger logger) { this.logger = logger; }
    public void reserve() { logger.log("Flight reserved"); }
}
