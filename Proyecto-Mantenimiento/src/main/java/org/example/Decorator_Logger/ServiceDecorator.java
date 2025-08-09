package org.example.Decorator_Logger;

abstract class ServiceDecorator implements ServiceInterface {
    protected ServiceInterface decoratedService;

    public ServiceDecorator(ServiceInterface decoratedService) {
        this.decoratedService = decoratedService;
    }
}
