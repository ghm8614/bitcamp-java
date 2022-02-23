package com.bitcamp.web.java.oop.jp02.part05;

// Inner Member Class
// innerMember Class는 클래스를 구성하는 필드,메서드와 같이 클래스가 구성하는 Member가 될수있다.(inner 클래스를 필드,메서드처럼 사용?)
// 사용이유는 OuterClass와 밀접한 관련
// 컴파일 이후 innerClass가 어떤 형태의 클래스가 되는지 확인..
public class OuterClass01 {

    //F
    private String outer = "Outer Class Field";

    //C
    public OuterClass01() {
    }

    //M
    public void outerMethod() {
        System.out.println(":: " + this.getClass().getName() + " 시작");
        // innerClass에 접근할 경우, 인스턴스 생성 후 접근
        InnerClass ic = new InnerClass();
        ic.innerMethod();
        System.out.println(":: " + this.getClass().getName() + " 끝");
    }

    //InnerMember Class
    public class InnerClass {
        //F
        private String inner = "Inner Class Field";

        //C
        public InnerClass() {
        }

        //M
        public void innerMethod() {
            // innerClass에서 outerClass로 접근
            // OuterClass01의 필드, 메서드에 쉽게 접근가능, 참조 불필요
            System.out.println(" :: " + this.getClass().getName() + " 시작");
            // OuterClass의 필드 접근 방식 : 2가지
            System.out.println(outer);
            System.out.println(OuterClass01.this.outer);
//            System.out.println(this.outer);   error 발생
            System.out.println(inner);
            System.out.println(" :: " + this.getClass().getName() + " 끝");
        }

    }

    //Main
    public static void main(String[] args) {
        new OuterClass01().outerMethod();
    }
}
