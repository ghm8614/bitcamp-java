package com.bitcamp.web.java.prob;

public class Prob20 {

    public static String myReplace(String str, char oldChar, char newChar) {

        return null;
    }

    //Main
    public static void main(String[] args) {
        System.out.println("문자열에 특정문자 변경하는 테스트");
        System.out.println("============Sample1===============");
        String str1 = myReplace("hello world", 'l', '*');
        System.out.println(str1);

        System.out.println("============Sample2===============");
        String str2 = myReplace("hello world", ' ', '-');
        System.out.println(str2);

        System.out.println("============Sample3===============");
        String str3 = myReplace("hello world", 'a', '*');
        System.out.println(str3);
    }
}
