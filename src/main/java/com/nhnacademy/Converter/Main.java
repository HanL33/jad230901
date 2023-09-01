package com.nhnacademy.Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter cv = new Converter();

        System.out.println("Enter Number");
        String number = sc.nextLine();

        System.out.println("-----------Select---------");
        System.out.println("1. Bin to Dec  2. Dec to Bin  3. Bin to Oct 4. Oct to Bin");
        System.out.println("5. Bin to Hex  6. Hex to Bin  7. Oct to Hex 8. Hex to Oct");
        int selectnum = sc.nextInt();

        switch (selectnum) {
            case 1:
                System.out.println(cv.ToDecimal(number, 2));
                break;
            case 2:
                cv.show_result(cv.DecimalTo(Integer.valueOf(number), 2));
                break;
            case 3:
                cv.show_result(cv.BinToOct(number));
                break;
            case 4:
                cv.show_result(cv.OctToBin(number));
                break;
            case 5:
                cv.hex_show(cv.BinToHex(number));
                break;
            case 6:
                cv.show_result(cv.HexToBin(number));
                break;
            case 7:
                cv.hex_show(cv.OctToHex(number));
                break;
            case 8:
                cv.show_result(cv.HexToOct(number));
                break;
            default:
                throw new IllegalArgumentException("please select 1 ~ 8");
        }


    }
}
