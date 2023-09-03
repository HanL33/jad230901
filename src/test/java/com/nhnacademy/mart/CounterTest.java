package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest {
    @Test
    @DisplayName("Wallet<totalTest")
    public void totalToBigTest() {
        Counter ct = new Counter();
        Food fd = new Food("양파", 20001);
        Basket bk = new Basket();
        bk.add(fd);
        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pay(bk));
    }

    @Test
    @DisplayName("totalisMinTest")
    public void totalIsMinTest() {
        Counter ct = new Counter();
        Food fd = new Food("양파", -1);
        Basket bk = new Basket();
        bk.add(fd);
        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pay(bk));
    }

    @Test
    @DisplayName("totaliszeroTest")
    public void totalIsZeroTest() {
        Counter ct = new Counter();
        Food fd = new Food("양파", 0);
        Basket bk = new Basket();
        bk.add(fd);
        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.pay(bk));
    }
}
