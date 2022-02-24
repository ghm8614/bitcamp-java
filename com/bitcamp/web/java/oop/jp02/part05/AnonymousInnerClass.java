package com.bitcamp.web.java.oop.jp02.part05;

// Ŭ������ �̸��� ���� ��Ư�� Ŭ����


class A {
    //F
    //C
    //M
    public void abc(String message) {
        System.out.println(":: " + this.getClass().getName() + " ����");
        System.out.println(":: abc() " + message);
        System.out.println(":: " + this.getClass().getName() + " ��");
    }
}

//        �ڵ� �����ϱ�
class B extends A {
    public void def(String message) {
        System.out.println(":: Hi " + message);
    }
}

public class AnonymousInnerClass {

    //Main
    public static void main(String[] args) {

        // 1. �ν��Ͻ� ���� ��, �ĺ���(��������)���� �޼��� ����
        System.out.println("1. ===================");
        A a = new A();
        a.abc("Hello");

        // 2. �ν��Ͻ� ������ ���ÿ� �ٷ� �޼��� ����
        System.out.println("2. ===================");
        new A().abc("Hello");

//        �ڵ� �����ϱ�
//        System.out.println("===================");
//        new B().abc("Hello");
//        new B().def("Hello");

        // 3. Anonymous (�͸�, �̸��� ����)
        System.out.println();
        new A() {
            public void def(String message) {
                System.out.println(":: " + this.getClass().getName() + " ����");
                System.out.println(":: def() " + message);
                System.out.println(":: " + this.getClass().getName() + " ��");
            }
        }.abc("Hello");

        System.out.println("4. ===================");
        new A() {
            public void def(String message) {
                System.out.println(":: " + this.getClass().getName() + " ����");
                System.out.println(":: def() " + message);
                System.out.println(":: " + this.getClass().getName() + " ��");
            }
        }.def("Hello");

    }//end of main
}//end of class
