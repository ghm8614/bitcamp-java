package com.bitcamp.web.java.oop.jp01.part02;

// Deep copy (������ �� ����)
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

        // �޼��� �Ű������� number 100 �Ѿ
        call.valueChange(call.number);  // 200 ���

        // number�� ���� �״�� 100, 200���� ������� ������
        System.out.println("number: " + call.number);
    }
}
