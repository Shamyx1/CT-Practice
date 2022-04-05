package com.company;

public abstract class Mmorpg implements Item {
    public Packing packing(){
        return new Copy();
    }
    @Override
    public abstract float price();
}
