package com.bitcamp.web.java.oop.jp02.part04;

public class FindOddExceptionTest {

    //C
    public FindOddExceptionTest() {
    }

    //M
    // 홀수 입력하면, FindOddException 발생시키는 메서드
    public void test(int number) throws FindOddException {

        System.out.println(":: " + this.getClass().getName() + " 시작");

        if (number % 2 == 0) {
            System.out.println("입력한 수: " + number);
        } else {
            throw new FindOddException();   // 이해하기...
        }

        System.out.println(":: " + this.getClass().getName() + " 끝");
    }

    //Main
    public static void main(String[] args) {
        FindOddExceptionTest met = new FindOddExceptionTest();
        try {
            met.test(10);
            met.test(11);
        } catch (FindOddException e) {
            System.out.println("e: " + e);
        }
    }
}
