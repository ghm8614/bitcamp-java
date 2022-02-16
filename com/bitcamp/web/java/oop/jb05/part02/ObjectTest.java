package com.bitcamp.web.java.oop.jb05.part02;

// static modifier 이해

// ObjectTest.class 실행 시 출력결과 예측하기
// static : 생성된 인스턴스들이 모두 공유하는 속성, 행위
// 보통 인스턴스로 접근 x, 클래스명으로 접근 o
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
