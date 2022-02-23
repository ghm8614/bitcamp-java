package com.bitcamp.web.java.prob;

public class Prob19 {

    //M
    public String leftPad(String str, int size, char padChar) {

        String result = "";
        int charCnt = size - str.length();

        if (str.length() > size) {
            return str;
        }

        for (int i = 0; i < charCnt; i++) {
//            result += String.format("%c", padChar);
            result += padChar;
        }
        result += str;
//        result += String.format("%s", str);

        return result;
    }

    //Main
    public static void main(String[] args) {

        Prob19 prob3 = new Prob19();

        System.out.println(prob3.leftPad("ABC", 6, '#'));
        System.out.println(prob3.leftPad("ABC", 5, '$'));
        System.out.println(prob3.leftPad("ABC", 2, '&'));
    }
}
