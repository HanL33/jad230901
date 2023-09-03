package com.nhnacademy.mart;

public class Counter {

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
        System.out.println("총 가격은 " + total + "원 입니다.");
        System.out.println("고객님 결제 후 잔액 :" + wallet);
    }
}
