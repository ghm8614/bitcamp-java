package com.bitcamp.web.java.prob;

public class Prob20 {

    // 문자열에서 특정문자를 다른문자로 바꾸는 메서드
    public static String myReplace(String str, char oldChar, char newChar) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                result += newChar;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
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
