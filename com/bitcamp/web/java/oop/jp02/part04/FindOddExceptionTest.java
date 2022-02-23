package com.bitcamp.web.java.oop.jp02.part04;

public class FindOddExceptionTest {

    //C
    public FindOddExceptionTest() {
    }

    //M
    // Ȧ�� �Է��ϸ�, FindOddException �߻���Ű�� �޼���
    public void test(int number) throws FindOddException {

        System.out.println(":: " + this.getClass().getName() + " ����");

        if (number % 2 == 0) {
            System.out.println("�Է��� ��: " + number);
        } else {
            throw new FindOddException();   // �����ϱ�...
        }

        System.out.println(":: " + this.getClass().getName() + " ��");
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
