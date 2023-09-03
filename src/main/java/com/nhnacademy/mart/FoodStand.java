package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodStand {
    private static final Logger logger = LoggerFactory.getLogger(Counter.class);
    private final ArrayList<Food> foods = new ArrayList<>();

    //  add 메서드 구현
    public void add(Food fd) {
        foods.add(fd);
    }

    // 장바구니에 담은 Food 삭제 구현
    public void delet_food(Food fd) {
        if (foods.isEmpty()) {
            logger.warn("처리 실패... 현재 진열대가 비어있습니다.");
            throw new IllegalArgumentException("Foodstand is empty");
        }

        if (foods.contains(fd)) {
            foods.remove(fd);
        } else {
            logger.warn("처리 실패... 해당 품목을 삭제 할 수 없습니다.");
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

    public int getAmount(Food food) {
        int front = foods.indexOf(food);
        int back = foods.lastIndexOf(food);
        int totalAmount = back - front;
        return totalAmount + 1;
    }
}
