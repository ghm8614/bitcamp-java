package com.bitcamp.web.java.test;

public class Test1 {
    public static void main(String[] args) {
        // 콘솔창에 두 문자 입력받기
        String name = args[0];
        String phoneNumber = args[1];

        // 큰따옴표 출력하기 -> 이스케이프 문자 사용
        System.out.println("나의 이름은 \"" + name + "\"입니다.");
        System.out.println("\"" + name + "\"씨의 [hp]는 \"" + phoneNumber + "\"입니다.");
    }
}
