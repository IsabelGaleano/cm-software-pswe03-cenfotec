package org.example.Decorator_Logger;

import org.example.Logger.Logger;

public class LoggingService extends ServiceDecorator {
    private Logger logger;

    public LoggingService(ServiceInterface decoratedService, Logger logger) {
        super(decoratedService);
        this.logger = logger;
    }

    @Override
    public void process() {
        logger.log("Start process");
        decoratedService.process();
        logger.log("End process");
    }

    @Override
    public void validate() {
        logger.log("Start validate");
        decoratedService.validate();
        logger.log("End validate");
    }
}
