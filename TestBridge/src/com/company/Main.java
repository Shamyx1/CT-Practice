package com.company;

public class Main {

    public static void main(String[] args) {

        GameCon cs = new Game("Counter-Strike","FPS",10,new DigitalGame());
        GameCon wow = new Game("World of Warcraft","MMORPG",25, new PhysicalGame());
        cs.display();
        wow.display();
    }
}
