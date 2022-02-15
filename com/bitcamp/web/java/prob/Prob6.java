package com.bitcamp.web.java.prob;

// 주어진 년도의 월에 해당하는 말일(maxDay) 계산하는 프로그램

// 윤년 조건
// 1. 4의 배수 : 윤년
// 2. 4의 배수이면서 100의 배수 : 윤년 x
// 3. 100의 배수이면서 400의 배수 : 윤년
public class Prob6 {
    public static void main(String[] args) {

        int year = 2010;
        int month = 2;
        int maxDay = 0;

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
                // 윤년일시, maxDay = 29;
                // 윤년아닐시, maxDay = 28;
                maxDay = 28;
                break;
        }

        // year%4 == 0 -> 윤년
        // year%4 == 0 && year%100 == 0 -> 윤년 x
        // year%100 == 0 && year%400 == 0 -> 윤년


//        if (year % 100 == 0) {
//            if (year % 400 == 0) {
//                System.out.println("윤년입니다.");
//            } else if (year % 4 == 0) {
//                System.out.println("윤년이 아닙니다.");
//            }
//        }



        System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다.");
    }
}
