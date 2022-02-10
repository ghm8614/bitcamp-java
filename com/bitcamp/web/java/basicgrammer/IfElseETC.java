package com.bitcamp.web.java.basicgrammer;

// 1. 문자를 int datatype으로 변경하는 Integer.parseInt() 사용
// 2. 특수문자(이스케이프) 사용하기 (/t, /n, /)

public class IfElseETC {
    public static void main(String[] args) {

        System.out.println("입력하신 1번째 인수는 :" + args[0]);
        System.out.println("입력하신 2번째 인수는 :" + args[1]);

        System.out.println("=========================");

        // 입력한 문자를 int datatype으로 변경하는 Integer.parseInt() 사용
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // i,j 변수의 값을 확인하자
        System.out.println("i=" + i + "\t j=" + j);
        System.out.println("한줄 처리\n");
        System.out.println("====================");

        if (i > j) {
            System.out.println("i가 j보다 큽니다.");
        } else if (i == j) {
            System.out.println("i가 j는 같습니다.");
        } else if (i < j) {
            System.out.println("i보다 j가 큽니다.");
        }

    }
}