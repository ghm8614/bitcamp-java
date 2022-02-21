package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 1���� ũ�� 10���� ���� �� �Է¹޾Ƽ� ������ ����ϱ�
public class Prob1 {

    //Method
    private static boolean CheckInvalidArgs(int dan) {
        if (dan < 2 || dan > 9) {
            System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
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
        System.out.print("1���� ũ�� 10���� ���� ���� �Է��ϼ���: ");
        int dan = sc.nextInt();

        if (CheckInvalidArgs(dan)) {    // ��ȿ�� üũ �޼��尡 true�� ����,
            printGugudan(dan);  // ������ �޼��� ȣ��
        }
    }
}
