package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    public void add_items(String s, int integer) {
        Item tem = new Item(s, integer);
        items.add(tem);
    }

    public int getSize() {
        return items.size();
    }

    // TODO add 메서드 생성
    public String getName(int index) {
        Item tem = items.get(index);
        return tem.getName();
    }

    public int getAmountOfItem(int index) {
        Item tem = items.get(index);
        return tem.getAmount();
    }

    public static class Item {
        private final String name;
        private final int amount;


        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        private Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }
}
