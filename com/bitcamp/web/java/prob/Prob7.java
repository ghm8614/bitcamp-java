package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 역삼각형 모양 symbol 출력 (단, 0이나 음수, 짝수 입력 X)
public class Prob7 {

//    private static void scanner() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("숫자를 입력하세요: ");
//        int number = sc.nextInt();
//
//        System.out.print("symbol 을 입력하세요: ");
//        String symbol = sc.next();
//    }

    //Method
    private static void printTriangle(int inputNum, String symbol) {

        // 유효성 검사
        if (inputNum < 1 || inputNum % 2 == 0 || symbol.length() < 1) {
            System.out.println("1 이상의 홀수를 입력하세요.");
            return;
        }

        int symbolCnt = inputNum;

        for (int i = 1; i <= inputNum / 2 + 1; i++) {  // 줄은 i에 종속적

            // 공백이 symbol 보다 앞에 위치 해야한다.
            for (int j = 0; j < i - 1; j++) {   // 공백은 i에 종속적
                System.out.print(" ");
            }
            for (int j = symbolCnt; j >= 1; j--) {  // symbol은 inputNum에 종속적
                System.out.print(symbol);
            }
            symbolCnt -= 2; // for 문 밖에서 -2

            System.out.println();
        }//end of for

    }

    //Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();

        System.out.print("symbol 을 입력하세요: ");
        String symbol = sc.next();

        //
        printTriangle(number, symbol);
    }
}
