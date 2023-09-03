package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();

        // 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer HansangLee = new Customer(buyList);

        // 장바구니를 챙긴다.
        HansangLee.bring(mart.provideBasket());

        // 식품을 담는다.
        HansangLee.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        HansangLee.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        //  Scanner 입력을 받아 buyList 만들기
        Scanner sc = new Scanner(System.in);
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");
        System.out.print("> ");
        String list = sc.nextLine();
        String[] blist = list.split(" ");
        //blist [사과, 2, 배, 3, ...]

        BuyList buyList = new BuyList();

        for (int i = 0; i < blist.length; i += 2) {
            buyList.add_items(blist[i], Integer.valueOf(blist[i + 1]));
        }
        return buyList;
    }
}
