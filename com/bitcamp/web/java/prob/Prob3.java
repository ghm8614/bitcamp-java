package com.bitcamp.web.java.prob;

import java.util.Scanner;

// ���丮��
public class Prob3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���: ");
        int inputNum = sc.nextInt();

        if (inputNum < 2 || inputNum > 9) {
            System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
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
