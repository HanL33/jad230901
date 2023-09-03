package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    //  add 메서드 구현
    public void add(Food fd) {
        foods.add(fd);
    }

    // 장바구니에 담은 Food 삭제 구현
    public void delet_food(Food fd) {
        if (foods.isEmpty()) {
            throw new IllegalArgumentException("Foodstand is empty");
        }

        if (foods.contains(fd)) {
            foods.remove(fd);
        } else {
            throw new IllegalArgumentException(fd.getName() + " is not exist!");
        }
    }

    public int getSize() {
        return foods.size();
    }


    public String getName(int index) {
        Food fd = foods.get(index);
        return fd.getName();
    }

    public Food getFood(int index) {
        return foods.get(index);
    }
}
