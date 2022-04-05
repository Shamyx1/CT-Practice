package com.company;

public class MpFactory extends AbstracvtFactory{

    private static MpFactory test2 = new MpFactory();
    private MpFactory(){};
    public static MpFactory getInstance()
    {
        return test2;
    }
    public Type getType(String gameType)
    {
        if ("FPS".equalsIgnoreCase(gameType))
        {
            return new Fps();
        }
        else if ("STRAT".equalsIgnoreCase(gameType))
        {
            return new Strat();
        }
        else return null;
    }
}
