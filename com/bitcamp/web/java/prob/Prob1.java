package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 1보다 크고 10보다 작은 수 입력받아서 구구단 출력하기
public class Prob1 {

    //Method
    private static boolean CheckInvalidArgs(int dan) {
        if (dan < 2 || dan > 9) {
            System.out.println("잘못된 숫자가 입력되었습니다.");
            return false;
        }
        return true;
    }

    private static void printGugudan(int dan) {

        final int COUNT = 9;

        for (int i = 1; i <= COUNT; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }

    //Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1보다 크고 10보다 작은 수를 입력하세요: ");
        int dan = sc.nextInt();

        if (CheckInvalidArgs(dan)) {    // 유효성 체크 메서드가 true일 때만,
            printGugudan(dan);  // 구구단 메서드 호출
        }
    }
}
