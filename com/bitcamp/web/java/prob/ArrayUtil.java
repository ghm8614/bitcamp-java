package com.bitcamp.web.java.prob;

public class ArrayUtil {

    //M
    public char[] reverseString(char[] s, int start, int end) {

        return null;
    }

    //Main
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        System.out.println(au.reverseString(s, 0, 3));
        System.out.println(au.reverseString(s, 4, 7));
        System.out.println(au.reverseString(s, 8, 10));
        System.out.println(au.reverseString(s, 0, 10));
    }
}
