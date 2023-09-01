package com.nhnacademy.Converter;

import java.util.Objects;

public class Converter {

    //16진수값 출력
    public void hex_show(int[] hex) {
        char[] hex_txt = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < hex.length; i++) {
            if (hex[i] <= 9) {
                System.out.print(hex[i]);
            } else {
                System.out.print(hex_txt[hex[i] - 9]);
            }
        }
    }

    //프린트 for문
    public void show_result(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public int[] re_arr(int[] arr) {
        int[] tmparr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            tmparr[j] = arr[i];
        }
        return tmparr;
    }

    //10진수를 2진수로
    public int[] DecimalTo(int decnumber, int selectnum) {
        int dec = decnumber;
        int count = 0;
        int tmpdec = dec;
        while (tmpdec > 0) {
            tmpdec /= selectnum;
            count++;
        }
        int[] result = new int[count];

        if (selectnum == 2) {
            for (int i = 0; i < count; i++) {
                result[i] = dec % 2;
                dec /= 2;
            }
        }
        //10진수를 8진수로
        else if (selectnum == 8) {
            for (int i = 0; i < count; i++) {
                result[i] = dec % 8;
                dec /= 8;
            }
        }
        //10진수를 16진수로
        else if (selectnum == 16) {
            for (int i = 0; i < count; i++) {
                result[i] = dec % 16;
                dec /= 16;
            }
        }
        return re_arr(result);
    }

    //10진수로
    public int ToDecimal(String number, int selectnum) {
        int result = 0;
        if (selectnum == 2 || selectnum == 8) {
            int num = Integer.valueOf(number);
            int count = number.length();
            int[] dec = new int[count];
            //2진수를 10진수로
            if (selectnum == 2) {
                for (int i = 0; i < count; i++) {
                    dec[i] = num % 10;
                    num /= 10;
                }
                for (int i = count - 1; i >= 0; i--) {
                    result += (int) (dec[i] * Math.pow(2, i));
                }
            }
            //8진수를 10진수로
            else {
                for (int i = 0; i < count; i++) {
                    dec[i] = num % 10;
                    num /= 10;
                }
                for (int i = count - 1; i >= 0; i--) {
                    result += (int) (dec[i] * Math.pow(8, i));
                }
            }
        }
        // 16진수를 10진수로
        if (selectnum == 16) {
            String[] hex_alphabet = {"A", "B", "C", "D", "E", "F"};
            String[] dec = number.split("");
            int[] decnum = new int[dec.length];

            for (int i = 0; i < dec.length; i++) {
                for (int j = 0; j < hex_alphabet.length; j++) {
                    if (Objects.equals(dec[i], hex_alphabet[j])) {
                        decnum[i] = j + 9;
                        break;
                    }
                }
                if (Objects.equals(decnum[i], 0)) {
                    decnum[i] = Integer.parseInt(dec[i]);
                }
            }
            decnum = re_arr(decnum);
            for (int i = dec.length - 1; i >= 0; i--) {
                result += (int) (decnum[i] * Math.pow(16, i));
            }
        }
        return result;
    }

    //2->8
    public int[] BinToOct(String number) {
        int mid = ToDecimal(number, 2);
        int[] result = DecimalTo(mid, 8);
        return result;
    }

    //2->16
    public int[] BinToHex(String number) {
        int mid = ToDecimal(number, 2);
        int[] result = DecimalTo(mid, 16);
        return result;
    }

    //8->2
    public int[] OctToBin(String number) {
        int mid = ToDecimal(number, 8);
        int[] result = DecimalTo(mid, 2);
        return result;
    }

    //8->16
    public int[] OctToHex(String number) {
        int mid = ToDecimal(number, 8);
        int[] result = DecimalTo(mid, 16);
        return result;
    }

    //16->2
    public int[] HexToBin(String number) {
        int mid = ToDecimal(number, 16);
        int[] result = DecimalTo(mid, 2);
        return result;
    }

    //16->8
    public int[] HexToOct(String number) {
        int mid = ToDecimal(number, 16);
        int[] result = DecimalTo(mid, 8);
        return result;
    }

}
