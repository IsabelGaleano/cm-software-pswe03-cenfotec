package org.example.Template_Beverage;

import org.example.Logger.Logger;

public abstract class Beverage {
    private Logger logger;

    public Beverage(Logger logger) {
        this.logger = logger;
    }

    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addExtras();
    }

    private void boilWater() { logger.log("Boiling water"); }
    private void pourInCup() { logger.log("Pouring in cup"); }

    protected abstract void brew();
    protected abstract void addExtras();

    protected Logger getLogger() { return logger; }
}
