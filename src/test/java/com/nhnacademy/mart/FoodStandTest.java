package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodStandTest {

    @Test
    @DisplayName("DeletTest")
    public void deletTest() {
        FoodStand fs = new FoodStand();
        Food fd = new Food("망고", 3000);
        Food fd2 = new Food("멜론", 5000);

        fs.add(fd);
        fs.delet_food(fd);

        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.delet_food(fd));
    }

    @Test
    @DisplayName("EmptyTest")
    public void emptyTest() {
        FoodStand fs = new FoodStand();
        Food fd = new Food("망고", 3000);

        fs.add(fd);
        fs.delet_food(fd);

        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.delet_food(fd));
    }


}
