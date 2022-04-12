package com.company;

public abstract  class GameCon {
    protected DisplayAPI displayAPI;

    protected GameCon(DisplayAPI displayAPI){
        this.displayAPI = displayAPI;
    }
    public abstract void display();
}
