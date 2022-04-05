package com.company;

public class Main {

    public static void main(String[] args) {

        GameBuilder gameBuilder = new GameBuilder();

        Game csgo = gameBuilder.csgo();
        System.out.println("CS:GO - FPS");
        csgo.showItems();

        Game valorant = gameBuilder.valorant();
        System.out.println("Valorant - FPS");
        valorant.showItems();

        Game wow = gameBuilder.wow();
        System.out.println("World of Warcraft - MMORPG");
        wow.showItems();

        Game gw = gameBuilder.gw();
        System.out.println("Guild wars 2 - MMORPG");
        gw.showItems();


    }
}
