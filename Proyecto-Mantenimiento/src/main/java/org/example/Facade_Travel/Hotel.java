package org.example.Facade_Travel;

import org.example.Logger.Logger;

public class Hotel {
    private Logger logger;
    public Hotel(Logger logger) { this.logger = logger; }
    public void reserve() { logger.log("Hotel reserved"); }
}
