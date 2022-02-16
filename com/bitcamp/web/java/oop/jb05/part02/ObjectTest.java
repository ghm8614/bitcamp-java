package com.bitcamp.web.java.oop.jb05.part02;

// static modifier ����

// ObjectTest.class ���� �� ��°�� �����ϱ�
// static : ������ �ν��Ͻ����� ��� �����ϴ� �Ӽ�, ����
// ���� �ν��Ͻ��� ���� x, Ŭ���������� ���� o
public class ObjectTest {

    //Field
    int i;
    static int j;

    // static block
    static {
        System.out.println("A> : j =" + j);
        j = 1;
        System.out.println("B> : j =" + j);
    }

    //Constructor
    public ObjectTest() {
        System.out.println("ObjectTest default Constructor ::C> i =" + i);
    }

    //Method
    public void printInstanceInt() {
        System.out.println("D > : i" + i);
    }

    //static Method
    public static void printClassInt() {
        System.out.println("E > : j" + j);
    }

    //Main
    public static void main(String[] args) {

        System.out.println("==========================");
        ObjectTest obj1 = new ObjectTest();
        obj1.printInstanceInt();
        obj1.printClassInt();
        System.out.println("==========================");
        ObjectTest.printClassInt();

        /*
        System.out.println("==========================");
        ObjectTest obj2 = new ObjectTest();
        obj2.i=100;
        System.out.println("obj2 = " + obj2);
        System.out.println("obj1 = " + obj1);

        System.out.println("==========================");
        obj2.j=3333;
        System.out.println("obj2 = " + obj2);
        System.out.println("obj1 = " + obj1);
        System.out.println("ObjectTest.j = " + ObjectTest.j);
        */
    }
}
