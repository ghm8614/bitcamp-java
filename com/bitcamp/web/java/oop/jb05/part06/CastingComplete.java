package com.bitcamp.web.java.oop.jb05.part06;

public class CastingComplete {
    public static void main(String[] args) {

        System.out.println("Super s1 = new Super();");
        Super s1 = new Super();
        s1.a();
        System.out.println("======================");

        System.out.println("Sub s2 = new Sub();");
        Sub s2 = new Sub();
        s2.a();
        s2.b();
        System.out.println("======================");


        // 중요

        // 묵시적 형변환
        // 하위클래스가 상위클래스를 공유(재사용)하고 확장하므로 하위클래스가 더 큰 타입같지만,
        // 개념적으로 더 큰 타입은 상위클래스.
        // 그래서 하위의 인스턴스를 상위타입에 대입가능

        // 상위 타입으로 하위 인스턴스 생성 (인스턴스와 데이터타입 구분)
        System.out.println("Super s3 = new Sub();");
        Super s3 = new Sub();   // 묵시적 형변환
        s3.a();
        //s3.b(); // compile error (s3는 b()를 참조할 수 없다.)  ????

        System.out.println("s3는 b()에 접근 불가");
        System.out.println("원래 자기 자신으로 명시적 형변환을 통해 돌아와야 함.");
        Sub sub = (Sub) s3;
        sub.b();

    }
}
