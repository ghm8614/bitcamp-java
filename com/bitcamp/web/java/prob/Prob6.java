package com.bitcamp.web.java.prob;

// �־��� �⵵�� ���� �ش��ϴ� ����(maxDay) ����ϴ� ���α׷�

import java.util.Scanner;

// ���� ����
// 1. 4�� ��� : ����
// 2. 4�� ����̸鼭 100�� ��� : ���� x
// 3. 100�� ����̸鼭 400�� ��� : ����

// year%4 == 0 -> ����
// year%4 == 0 && year%100 == 0 -> ���� x
// year%100 == 0 && year%400 == 0 -> ����
public class Prob6 {

    //Method
    public static int checkFebruaryMaxDay(int year) {
        int maxDay = 1;

        if (year % 4 == 0) {
            maxDay = 29;

            if (year % 100 == 0) {
                maxDay = 28;

                if (year % 400 == 0) {
                    maxDay = 29;
                }
            }
        }
        return maxDay;
    }

    //Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("year: ");
        int year = sc.nextInt();

        System.out.print("month: ");
        int month = sc.nextInt();
        int maxDay = 1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;

            case 2:
                maxDay = checkFebruaryMaxDay(year);
                break;
        }

        System.out.println(year + "�� " + month + "���� ������ " + maxDay + "�� �Դϴ�.");
    }
}
