package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 1���� ũ�� 10���� ���� �� �Է¹޾Ƽ� ������ ����ϱ�
public class Prob1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1���� ũ�� 10���� ���� ���� �Է��ϼ���: ");
        int dan = sc.nextInt();

        // ���� ����
        int count = 9;

        // 1. 2���� �۰ų� 9���� ũ�� ���޽��� ���
        if (dan < 2 || dan > 9) {
            System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
            return;   // if ���� ���Ե� main �޼��� ����, �� ���α׷� ����!  break�� ȥ�� ����
        }

        // 2. �Է¹��� ���� ������ ���
        for (int i = 1; i <= count; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
