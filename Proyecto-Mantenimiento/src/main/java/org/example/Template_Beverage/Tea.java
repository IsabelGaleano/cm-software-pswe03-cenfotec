package org.example.Template_Beverage;

import org.example.Logger.Logger;

public class Tea extends Beverage{
    public Tea(Logger logger) { super(logger); }
    protected void brew() { getLogger().log("Steeping the tea"); }
    protected void addExtras() { getLogger().log("Adding lemon"); }
}
