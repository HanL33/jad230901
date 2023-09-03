package com.nhnacademy.mart;

import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Counter.class);

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // pickFoods 메서드 구현

    public void pickFoods(FoodStand foodStand) {
        int count = 0;
        for (int i = 0; i < buyList.getSize(); i++) {
            for (int z = 0; z < buyList.getAmountOfItem(i); z++, count++) {
                int countfs = foodStand.getSize();
                for (int j = 0; j < foodStand.getSize(); j++) {
                    if (Objects.equals(buyList.getName(i), foodStand.getName(j))) {
                        if (foodStand.getAmount(foodStand.getFood(j)) < buyList.getAmountOfItem(i)) {
                            logger.error("처리 실패... 남아있는 재고를 찾을 수 없습니다.");
                            throw new IllegalArgumentException("재고부족!");
                        }
                        basket.add(foodStand.getFood(j));
                        foodStand.delet_food(foodStand.getFood(j));
                        break;
                    }
                }
                if (countfs == foodStand.getSize()) {
                    logger.error("처리 실패...해당 품목은 현재 준비중입니다.");
                    throw new IllegalArgumentException("해당 품목은 현재 준비중입니다.");
                }
            }
        }
    }

    public void payTox(Counter counter) {
        counter.pay(basket);
    }


    // payTox 메서드 구현
    //getcounter로 카운터 생성
    //생성된 카운터를 paytox메서드로 불러와서 계산시킴


}
