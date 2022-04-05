package com.company;

public class Main {

    public static void main(String[] args) {

        TypeFactory typeFactory = new TypeFactory();

        Type fps = typeFactory.getType("FPS");
        fps.display();

        Type mmo = typeFactory.getType("MMO");
        mmo.display();

        Type strat = typeFactory.getType("STRAT");
        strat.display();
    }
}
