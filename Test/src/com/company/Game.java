package com.company;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item)
    {
        items.add(item);
    }

//    public float getPrice(){
//        float price = 0;
//
//        for (Item item : items)
//        {
//            price = price + item.price();
//        }
//        return price;
//    }

    public void showItems(){
        for (Item item: items)
        {
            System.out.print("Game: "+ item.name());
            System.out.print(", Packing : " +item.packing().pack());
            System.out.println(", Price : " +item.price()+"e");
        }
    }
}
