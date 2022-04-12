package com.company;

public class DigitalGame implements DisplayAPI{
    @Override
    public void displayGame(String name, String genre, int price) {
        System.out.println("Digital copy. Name: " + name + ", Genre: " + genre + ", Price: " +price+"e");
    }
}
