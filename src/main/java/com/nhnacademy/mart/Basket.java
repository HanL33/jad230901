package com.nhnacademy.mart;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public String getName(int index) {
        Food fd = foods.get(index);
        return fd.getName();
    }

    public int getPrice(int index) {
        Food fd = foods.get(index);
        return fd.getPrice();
    }

    public int getSize() {
        return foods.size();
    }
}
