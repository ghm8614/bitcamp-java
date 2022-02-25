package com.bitcamp.web.java.prob;

public class ArrayUtil {

    //M
    // 문자를 거꾸로 뒤집는 메서드 (start~end)
    public char[] reverseString(char[] s, int start, int end) {

        char[] charArr = new char[s.length];
        int index = 0;

        for (int i = 0; i < start; i++) {
            charArr[index] = s[i];
            index++;
        }
        for (int i = end; i >= start; i--) {
            charArr[index] = s[i];
            index++;
        }
        for (int i = end + 1; i < s.length; i++) {
            charArr[index] = s[i];
            index++;
        }

        return charArr;
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
