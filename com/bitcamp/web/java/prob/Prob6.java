package com.bitcamp.web.java.prob;

// 주어진 년도의 월에 해당하는 말일(maxDay) 계산하는 프로그램

import java.util.Scanner;

// 윤년 조건
// 1. 4의 배수 : 윤년
// 2. 4의 배수이면서 100의 배수 : 윤년 x
// 3. 100의 배수이면서 400의 배수 : 윤년

// year%4 == 0 -> 윤년
// year%4 == 0 && year%100 == 0 -> 윤년 x
// year%100 == 0 && year%400 == 0 -> 윤년
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

        System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다.");
    }
}
