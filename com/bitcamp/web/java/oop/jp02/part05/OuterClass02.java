package com.bitcamp.web.java.oop.jp02.part05;

// Inner Member Class
// 1. inner localClass�� �޼���� ������ ���������� ���� level
// 2. ������ �� innerClass Ȯ��
public class OuterClass02 {

    //F
    private String outer = "Outer Class Field";

    //C
    public OuterClass02() {
    }

    //M
    public void outerMethod() {

        System.out.println(":: " + this.getClass().getName() + " ����");

        final String localVariable = "OuterClass ���� outerMethod�� ��������";

        // inner local Class
        class InnerLocalClass {
            //F
            private String inner = "innerClass �� �ʵ�";

            //C
            public InnerLocalClass() {
            }

            //M
            public void innerMethod() {
                System.out.println();
                System.out.println(":: " + this.getClass().getName() + " ����");
                //innerClass���� OuterClass�� �����ϱ�
                System.out.println(localVariable);
                System.out.println(outer);
                System.out.println(inner);
                System.out.println(":: " + this.getClass().getName() + " ��");
            }
        }

        System.out.println(":: " + this.getClass().getName() + " ����");

        // inner local class �� �ѷ��� method ���� �ν��Ͻ� ��������
        InnerLocalClass ilc = new InnerLocalClass();
        ilc.innerMethod();
    }

    //Main
    public static void main(String[] args) {
        new OuterClass02().outerMethod();
    }
}
