package com.bitcamp.web.java.prob;

public class Prob17 {

    //Method
    public static void printGugudan(int dan) {

        final int COUNT = 9;

        // ��ȿ�� üũ
        if (dan < 1 || dan > 9) {
            System.out.println("1 �̻� 9 ������ ���� �Է��ϼž� �մϴ�. ");
            return;
        }

        for (int i = 1; i <= COUNT; i++) {
            for (int j = 1; j <= dan; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }

    //Main
    public static void main(String[] args) {
        System.out.println("�־��� ���ڱ����� �������� ����ϴ�.");
        System.out.println("==============Sample 1===============");
        printGugudan(4);

        System.out.println("==============Sample 2===============");
        printGugudan(9);

        System.out.println("==============Sample 3===============");
        printGugudan(-1);

        System.out.println("==============Sample 4===============");
        printGugudan(10);
    }
}
