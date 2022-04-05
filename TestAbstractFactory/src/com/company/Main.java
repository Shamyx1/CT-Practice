package com.company;

public class Main {

    public static void main(String[] args) {

        AbstracvtFactory gameFactory = FactoryPicker.getFactory(true);
        Type type1 = gameFactory.getType("FPS");
        type1.display();
        Type type2 = gameFactory.getType("STRAT");
        type2.display();

        AbstracvtFactory gameFactory2 = FactoryPicker.getFactory(false);
        Type type3 = gameFactory2.getType("FPS");
        type3.display();
        Type type4 = gameFactory2.getType("STRAT");
        type4.display();

    }
}
