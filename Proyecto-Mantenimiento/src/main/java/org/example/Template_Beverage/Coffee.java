package org.example.Template_Beverage;

import org.example.Logger.Logger;

public class Coffee extends Beverage {
    public Coffee(Logger logger) { super(logger); }
    protected void brew() { getLogger().log("Dripping coffee through filter"); }
    protected void addExtras() { getLogger().log("Adding sugar and milk"); }
}
