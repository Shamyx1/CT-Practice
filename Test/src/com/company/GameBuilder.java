package com.company;

public class GameBuilder {

    public Game csgo(){
        Game game = new Game();
        game.addItem(new Csgo());
        return game;
    }
    public Game valorant(){
        Game game = new Game();
        game.addItem(new Valorant());
        return game;
    }
    public Game wow(){
        Game game = new Game();
        game.addItem(new Wow());
        return game;
    }
    public Game gw(){
        Game game = new Game();
        game.addItem(new Gw());
        return game;
    }
}
