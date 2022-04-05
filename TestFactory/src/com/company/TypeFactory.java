package com.company;

public class TypeFactory {

    public Type getType(String gameType){

        if("FPS".equalsIgnoreCase(gameType)){
            return new Fps();
        }
        else if("MMO".equalsIgnoreCase(gameType)){
            return new Mmo();
        }
        else if("STRAT".equalsIgnoreCase(gameType)){
            return new Strat();
        }
        return null;
    }
}
