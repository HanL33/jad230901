package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    @DisplayName("CannotFindRemainsTest")
    public void CannotFindRemainsTest1() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList bl = new BuyList();
        bl.add_items("양파", 3);

        Customer ct = new Customer(bl);
        ct.bring(mart.provideBasket());

        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pickFoods(mart.getFoodStand()));
    }

    @Test
    @DisplayName("CannotFindRemainsTest")
    public void CannotFindRemainsTest2() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList bl = new BuyList();
        bl.add_items("계란", 6);

        Customer ct = new Customer(bl);
        ct.bring(mart.provideBasket());

        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pickFoods(mart.getFoodStand()));
    }

    @Test
    @DisplayName("CannotFindRemainsTest")
    public void CannotFindRemainsTest3() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList bl = new BuyList();
        bl.add_items("파", 11);

        Customer ct = new Customer(bl);
        ct.bring(mart.provideBasket());

        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pickFoods(mart.getFoodStand()));
    }

    @Test
    @DisplayName("CannotFindRemainsTest")
    public void CannotFindRemainsTest4() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList bl = new BuyList();
        bl.add_items("사과", 21);

        Customer ct = new Customer(bl);
        ct.bring(mart.provideBasket());

        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pickFoods(mart.getFoodStand()));
    }

    @Test
    @DisplayName("CannotFinditemTest")
    public void CannotFindRItemTest() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList bl = new BuyList();
        bl.add_items("망고", 2);

        Customer ct = new Customer(bl);
        ct.bring(mart.provideBasket());

        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pickFoods(mart.getFoodStand()));
    }


}
