package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 팩토리얼
public class Prob3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1보다 크고 10보다 작은 정수를 입력하세요: ");
        int inputNum = sc.nextInt();

        if (inputNum < 2 || inputNum > 9) {
            System.out.println("잘못된 숫자가 입력되었습니다.");
            return;
        }

        // inputNum : 3 -> 1*2*3
        // inputNum : 5 -> 1*2*3*4*5

        int result = 1;
        for (int i = 1; i <= inputNum; i++) {
            result *= i;
            System.out.println(i + " ! = " + result);
        }
    }
}
