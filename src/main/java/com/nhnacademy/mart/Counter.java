package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Counter {
    private static final Logger logger = LoggerFactory.getLogger(Counter.class);
    // pay 메서드 구현 (카운터에서 계산 처리 메서드)
    private int total;
    private int wallet;

    public Counter() {
        total = 0;
        wallet = 20000;
    }

    public void pay(Basket basket) {
        for (int i = 0; i < basket.getSize(); i++) {
            total += basket.getPrice(i);
        }
        wallet = wallet - total;

        if (wallet < 0) {
            logger.warn("계산 실패... 지갑에 있는 돈으로 계산할 수 없습니다.");
            throw new IllegalArgumentException("지갑에 있는 돈보다 초과해서 구매할 수 없습니다!");
        } else if (total < 0) {
            logger.warn("계산 실패... 구매하려는 물건의 가격이 마이너스입니다.");
            throw new IllegalArgumentException("물건의 가격이 마이너스입니다!");
        } else if (total == 0) {
            logger.warn("계산 실패... 계산할 물건이 존재하지 않습니다.");
            throw new IllegalArgumentException("계산할 물건이 존재하지 않습니다!");
        }
        System.out.println("총 가격은 " + total + "원 입니다.");
        System.out.println("고객님 결제 후 잔액 :" + wallet);
    }
}
