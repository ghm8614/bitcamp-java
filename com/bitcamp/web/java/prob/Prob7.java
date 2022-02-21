package com.bitcamp.web.java.prob;

import java.util.Scanner;

// ���ﰢ�� ��� symbol ��� (��, 0�̳� ����, ¦�� �Է� X)
public class Prob7 {

//    private static void scanner() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("���ڸ� �Է��ϼ���: ");
//        int number = sc.nextInt();
//
//        System.out.print("symbol �� �Է��ϼ���: ");
//        String symbol = sc.next();
//    }

    //Method
    private static void printTriangle(int inputNum, String symbol) {

        // ��ȿ�� �˻�
        if (inputNum < 1 || inputNum % 2 == 0 || symbol.length() < 1) {
            System.out.println("1 �̻��� Ȧ���� �Է��ϼ���.");
            return;
        }

        int symbolCnt = inputNum;

        for (int i = 1; i <= inputNum / 2 + 1; i++) {  // ���� i�� ������

            // ������ symbol ���� �տ� ��ġ �ؾ��Ѵ�.
            for (int j = 0; j < i - 1; j++) {   // ������ i�� ������
                System.out.print(" ");
            }
            for (int j = symbolCnt; j >= 1; j--) {  // symbol�� inputNum�� ������
                System.out.print(symbol);
            }
            symbolCnt -= 2; // for �� �ۿ��� -2

            System.out.println();
        }//end of for

    }

    //Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("���ڸ� �Է��ϼ���: ");
        int number = sc.nextInt();

        System.out.print("symbol �� �Է��ϼ���: ");
        String symbol = sc.next();

        //
        printTriangle(number, symbol);
    }
}
