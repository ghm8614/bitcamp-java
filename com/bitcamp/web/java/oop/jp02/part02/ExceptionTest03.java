package com.bitcamp.web.java.oop.jp02.part02;

// 인자값이 0이면 실행시 문제발생
// ArithmeticException:  by zero

// throw 로 메서드 호출한 쪽에 예외던지기
public class ExceptionTest03 {

    //Field
    private int sum;
    private int avg;

    //C
    public ExceptionTest03() {
    }

    //M
    public void sum(int x, int y) {
        System.out.println("1. sum 시작");
        sum = x + y;
        System.out.println("1. sum : " + sum);
        System.out.println("1. sum 끝");
    }

    // z : 0이면, 문제발생
    public void avg(int z) throws ArithmeticException {
        System.out.println("2. avg 시작");
        avg = sum / z;
        System.out.println("2. avg : " + avg);
        System.out.println("2. avg 끝");
    }

    //Main
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest03 et = new ExceptionTest03();
        et.sum(i, j);

        // Exception 확인하기
        et.avg(k);

        System.out.println("메인 메서드 종료");
    }//end of main
}//end of class
