package com.bitcamp.web.java.oop.jp02.part02;

// ���ڰ��� 0�̸� ����� �����߻�
// ArithmeticException:  by zero
public class ExceptionTest01 {

    //Field
    private int sum;
    private int avg;

    //C
    public ExceptionTest01() {
    }

    //M
    public void sum(int x, int y) {
        System.out.println("1. sum ����");
        sum = x + y;
        System.out.println("1. sum : " + sum);
        System.out.println("1. sum ��");
    }

    // z : 0�̸�, �����߻�
    public void avg(int z) {
        System.out.println("2. avg ����");
        avg = sum / z;
        System.out.println("2. avg : " + avg);
        System.out.println("2. avg ��");
    }

    //Main
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest01 et = new ExceptionTest01();
        et.sum(i,j);
        et.avg(k);

        System.out.println("���� �޼��� ����");
    }//end of main
}//end of class
