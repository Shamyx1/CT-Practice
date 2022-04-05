package com.company;

public class SpFactory extends AbstracvtFactory {
    private static SpFactory test = new SpFactory();
    private SpFactory(){};
    public static SpFactory getInstance()
    {
        return test;
    }
    @Override
    public Type getType (String gameType)
    {
        if("STRAT".equalsIgnoreCase(gameType))
        {
            return new StratSp();
        }
        else if ("FPS".equalsIgnoreCase(gameType))
        {
            return new FpsSp();
        }
        else return null;
    }
}
