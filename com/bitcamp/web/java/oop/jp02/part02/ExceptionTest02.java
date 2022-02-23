package com.bitcamp.web.java.oop.jp02.part02;

// ���ڰ��� 0�̸� ����� �����߻�
// ArithmeticException:  by zero

// try-catch �� ����ó��
public class ExceptionTest02 {

    //Field
    private int sum;
    private int avg;

    //C
    public ExceptionTest02() {
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
        try {
            avg = sum / z;
        } catch (ArithmeticException e) {
            System.out.println("1. ====================");
            System.out.println("z���� 0�ΰ� �����ϴ�... ������ �Ұ�");
            System.out.println("2. ====================");
            System.out.println(e);  // System.out.println(e.toString());
            System.out.println("3. ====================");
//            e.printStackTrace();      // ��������, �������� ����ϴ� ���� ȥ�� ����
            System.out.println("4. ====================");
        }
        System.out.println("2. avg : " + avg);
        System.out.println("2. avg ��");
    }

    //Main
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest02 et = new ExceptionTest02();
        et.sum(i,j);
        et.avg(k);

        System.out.println("���� �޼��� ����");
    }//end of main
}//end of class
