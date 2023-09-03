package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    @DisplayName("CannotFindRemainsTest")
    public void CannotFindRemainsTest() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList bl = new BuyList();
        bl.add_items("양파", 3);

        Customer ct = new Customer(bl);
        ct.bring(mart.provideBasket());

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> ct.pickFoods(mart.getFoodStand()));
    }
}
