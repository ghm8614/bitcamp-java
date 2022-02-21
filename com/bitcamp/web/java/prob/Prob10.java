package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 삼각형 모양 symbol 출력
public class Prob10 {

    //Method
    private static boolean checkInvalidArgs(int lineCnt, String symbol) {
        // 유효성 검사
        if (lineCnt < 1 || symbol.length() < 1) {
            System.out.println("잘못 입력하셨습니다.");
            return false;
        }
        return true;
    }

    private static void printTriangle(int lineCnt, String symbol) {

        for (int i = 1; i <= lineCnt; i++) {
            for (int j = 1; j <= lineCnt - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    //Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 삼각형의 line 수 : ");
        int line = sc.nextInt();

        System.out.print("출력할 삼각형의 symbol : ");
        String symbol = sc.next();

        // 호출
        if (checkInvalidArgs(line, symbol)) {
            printTriangle(line, symbol);
        }
    }
}
