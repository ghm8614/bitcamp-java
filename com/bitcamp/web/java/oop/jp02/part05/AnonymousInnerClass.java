package com.bitcamp.web.java.oop.jp02.part05;

// 클래스의 이름이 없는 독특한 클래스


class A {
    //F
    //C
    //M
    public void abc(String message) {
        System.out.println(":: " + this.getClass().getName() + " 시작");
        System.out.println(":: abc() " + message);
        System.out.println(":: " + this.getClass().getName() + " 끝");
    }
}

//        코드 이해하기
class B extends A {
    public void def(String message) {
        System.out.println(":: Hi " + message);
    }
}

public class AnonymousInnerClass {

    //Main
    public static void main(String[] args) {

        // 1. 인스턴스 생성 후, 식별성(참조변수)으로 메서드 접근
        System.out.println("1. ===================");
        A a = new A();
        a.abc("Hello");

        // 2. 인스턴스 생성과 동시에 바로 메서드 접근
        System.out.println("2. ===================");
        new A().abc("Hello");

//        코드 이해하기
//        System.out.println("===================");
//        new B().abc("Hello");
//        new B().def("Hello");

        // 3. Anonymous (익명, 이름이 없는)
        System.out.println();
        new A() {
            public void def(String message) {
                System.out.println(":: " + this.getClass().getName() + " 시작");
                System.out.println(":: def() " + message);
                System.out.println(":: " + this.getClass().getName() + " 끝");
            }
        }.abc("Hello");

        System.out.println("4. ===================");
        new A() {
            public void def(String message) {
                System.out.println(":: " + this.getClass().getName() + " 시작");
                System.out.println(":: def() " + message);
                System.out.println(":: " + this.getClass().getName() + " 끝");
            }
        }.def("Hello");

    }//end of main
}//end of class
