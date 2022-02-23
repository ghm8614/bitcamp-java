package com.bitcamp.web.java.oop.jp02.part02;

// ���ڰ��� 0�̸� ����� �����߻�
// ArithmeticException:  by zero

// try-catch �� ����ó��
public class ExceptionTest04 {

    //Field
    private int sum;
    private int avg;

    //C
    public ExceptionTest04() {
    }

    //M
    public void sum(int x, int y) {
        System.out.println("1. sum ����");
        sum = x + y;
        System.out.println("1. sum : " + sum);
        System.out.println("1. sum ��");
    }

    // z : 0�̸�, �����߻�
    public void avg(int z) throws ArithmeticException {
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

        ExceptionTest04 et = new ExceptionTest04();
        et.sum(i, j);

        try {
            et.avg(k);
        }
//        catch (ArithmeticException e) {
////            e.printStackTrace();
//        }
        catch (Exception e) {
            System.out.println("1. ====================");
            System.out.println("et.avg(k) �޼��� ȣ��� ���� �߻�");
            System.out.println("2. ====================");
            System.out.println(e);  // System.out.println(e.toString());
            System.out.println("3. ====================");
//            e.printStackTrace();      // ��������, �������� ����ϴ� ���� ȥ�� ����
            System.out.println("4. ====================");
        }

        System.out.println("���� �޼��� ����");
    }//end of main
}//end of class
