package com.bitcamp.web.java.oop.jp02.part05;

// Inner Member Class
// 1. inner localClass는 메서드와 내부의 지역변수와 같은 level
// 2. 컴파일 후 innerClass 확인
public class OuterClass02 {

    //F
    private String outer = "Outer Class Field";

    //C
    public OuterClass02() {
    }

    //M
    public void outerMethod() {

        System.out.println(":: " + this.getClass().getName() + " 시작");

        final String localVariable = "OuterClass 내의 outerMethod의 지역변수";

        // inner local Class
        class InnerLocalClass {
            //F
            private String inner = "innerClass 의 필드";

            //C
            public InnerLocalClass() {
            }

            //M
            public void innerMethod() {
                System.out.println();
                System.out.println(":: " + this.getClass().getName() + " 시작");
                //innerClass에서 OuterClass로 접근하기
                System.out.println(localVariable);
                System.out.println(outer);
                System.out.println(inner);
                System.out.println(":: " + this.getClass().getName() + " 끝");
            }
        }

        System.out.println(":: " + this.getClass().getName() + " 시작");

        // inner local class 를 둘러싼 method 에서 인스턴스 생성가능
        InnerLocalClass ilc = new InnerLocalClass();
        ilc.innerMethod();
    }

    //Main
    public static void main(String[] args) {
        new OuterClass02().outerMethod();
    }
}
