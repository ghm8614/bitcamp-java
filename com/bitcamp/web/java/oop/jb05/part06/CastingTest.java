package com.bitcamp.web.java.oop.jb05.part06;

public class CastingTest {
    public static void main(String[] args) {

        Father father = new Father();
        father.work();
        System.out.println("===============");

        Son son = new Son();
        son.work();
        son.study();
        System.out.println("===============");

        Father f = new Son();
        f.work();   // 왜 Son에서 오버라이딩 된 '알바하다'가 나올까?
        
        // 사용불가
//        f.study();
//        f.play();
        System.out.println("===============");

        Son s = (Son)f;
        s.work();
        s.study();
    }
}
