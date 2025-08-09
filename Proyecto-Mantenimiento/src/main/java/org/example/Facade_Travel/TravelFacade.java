package org.example.Facade_Travel;

import org.example.Logger.Logger;

public class TravelFacade {
    private Flight flight;
    private Hotel hotel;
    private CarRental car;
    private Logger logger;

    public TravelFacade(Logger logger) {
        this.logger = logger;
        this.flight = new Flight(logger);
        this.hotel = new Hotel(logger);
        this.car = new CarRental(logger);
    }

    public void bookCompleteTrip() {
        flight.reserve();
        hotel.reserve();
        car.reserve();
        logger.log("Trip booking completed!");
    }
}
