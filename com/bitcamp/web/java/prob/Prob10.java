package com.bitcamp.web.java.prob;

import java.util.Scanner;

// �ﰢ�� ��� symbol ���
public class Prob10 {

    //Method
    private static boolean checkInvalidArgs(int lineCnt, String symbol) {
        // ��ȿ�� �˻�
        if (lineCnt < 1 || symbol.length() < 1) {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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

        System.out.print("����� �ﰢ���� line �� : ");
        int line = sc.nextInt();

        System.out.print("����� �ﰢ���� symbol : ");
        String symbol = sc.next();

        // ȣ��
        if (checkInvalidArgs(line, symbol)) {
            printTriangle(line, symbol);
        }
    }
}
