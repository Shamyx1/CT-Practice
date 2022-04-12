package com.company;

public class PhysicalGame implements DisplayAPI{
    @Override
    public void displayGame(String name, String genre, int price) {
        System.out.println("Physical copy. Name: " + name + ",Genre: " + genre + ", Price: " + price + "e");
    }
}
