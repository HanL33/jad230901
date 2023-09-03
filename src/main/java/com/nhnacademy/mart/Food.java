package com.nhnacademy.mart;

public class Food {

    private final String name;
    private final int price;

    public Food(String name, int paycode) {
        this.name = name;
        this.price = paycode;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
