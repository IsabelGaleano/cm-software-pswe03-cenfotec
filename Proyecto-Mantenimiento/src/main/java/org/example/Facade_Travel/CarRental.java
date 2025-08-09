package org.example.Facade_Travel;

import org.example.Logger.Logger;

public class CarRental {
    private Logger logger;
    public CarRental(Logger logger) { this.logger = logger; }
    public void reserve() { logger.log("Car reserved"); }
}
