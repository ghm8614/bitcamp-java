package com.bitcamp.web.java.oop.jp02.part02;

// 인자값이 0이면 실행시 문제발생
// ArithmeticException:  by zero

// try-catch 로 예외처리
public class ExceptionTest02 {

    //Field
    private int sum;
    private int avg;

    //C
    public ExceptionTest02() {
    }

    //M
    public void sum(int x, int y) {
        System.out.println("1. sum 시작");
        sum = x + y;
        System.out.println("1. sum : " + sum);
        System.out.println("1. sum 끝");
    }

    // z : 0이면, 문제발생
    public void avg(int z) {
        System.out.println("2. avg 시작");
        try {
            avg = sum / z;
        } catch (ArithmeticException e) {
            System.out.println("1. ====================");
            System.out.println("z값이 0인것 같습니다... 나누기 불가");
            System.out.println("2. ====================");
            System.out.println(e);  // System.out.println(e.toString());
            System.out.println("3. ====================");
//            e.printStackTrace();      // 에러인지, 에러문을 출력하는 건지 혼동 주의
            System.out.println("4. ====================");
        }
        System.out.println("2. avg : " + avg);
        System.out.println("2. avg 끝");
    }

    //Main
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest02 et = new ExceptionTest02();
        et.sum(i,j);
        et.avg(k);

        System.out.println("메인 메서드 종료");
    }//end of main
}//end of class
