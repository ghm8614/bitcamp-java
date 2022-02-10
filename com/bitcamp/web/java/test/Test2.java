package com.bitcamp.web.java.test;

public class Test2 {
    public static void main(String[] args) {

        // 콘솔창에 두 문자열 입력받고, int로 변환
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // 더하고 빼기 변수 선언
        int sum;
        int subtraction;

        // 두 수 비교해서 출력하기
        if (i > j) {
            subtraction = i - j;
            System.out.printf("첫번째 인수: %d, 두번째 인수: %d, %d-%d=%d입니다.", i, j, i, j, subtraction);
        } else if (i < j) {
            sum = i + j;
            System.out.printf("첫번째 인수: %d, 두번째 인수: %d, %d+%d=%d입니다.", i, j, i, j, sum);
        }
    }
}
