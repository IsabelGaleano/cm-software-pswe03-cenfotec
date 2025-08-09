package org.example.Facade_Travel;

import org.example.Logger.ConsoleLogger;
import org.example.Logger.Logger;

public class MainFacade {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        TravelFacade travelFacade = new TravelFacade(logger);
        travelFacade.bookCompleteTrip();
    }
}
