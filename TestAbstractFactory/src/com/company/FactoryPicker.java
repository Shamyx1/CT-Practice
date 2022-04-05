package com.company;
public class FactoryPicker {
    static SpFactory test = SpFactory.getInstance();
    static MpFactory test2 = MpFactory.getInstance();
    private FactoryPicker(){};

    public static AbstracvtFactory getFactory(boolean multiplayer){


//        MpFactory test = new MpFactory();
//        SpFactory test2 = new SpFactory();
        if (multiplayer){
            return  test;
        }
        else
        {
            return test2;
        }
    }
}
