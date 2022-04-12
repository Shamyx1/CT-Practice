package com.company;

public class Game extends GameCon{
    private int price;
    private String name;
    private String genre;

    public Game (String name, String genre, int price, DisplayAPI displayAPI){
        super(displayAPI);
        this.name = name;
        this.genre = genre;
        this.price = price;
    }
    public void display() {
        displayAPI.displayGame(name,genre,price);
    }
}
