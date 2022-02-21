package com.bitcamp.web.java.oop.jp01.part02;

// Deep copy (데이터 값 복사)
public class CallByValueTest {

    int number = 100;

    //Method
    public void valueChange(int value) {
        System.out.println("===============");
        value += 100;
        System.out.println("value : " + value);
        System.out.println("===============");
    }

    //Main
    public static void main(String[] args) {

        CallByValueTest call = new CallByValueTest();

        // 메서드 매개변수로 number 100 넘어감
        call.valueChange(call.number);  // 200 출력

        // number의 값은 그대로 100, 200으로 변경되지 않음음
        System.out.println("number: " + call.number);
    }
}
