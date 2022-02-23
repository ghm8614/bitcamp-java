package com.bitcamp.web.java.oop.jb05.part06;

public class CastingTest {
    public static void main(String[] args) {

//        Father father = new Father();
//        father.study();
//        father.work();
//        System.out.println("===============");

//        Son son = new Son();
//        son.study();// 공유
//        son.work();//오버라이딩
//        son.play();//son메서드
//        System.out.println("===============");

        Father f = new Son();
        f.study();
        f.work();   // 왜 Son에서 오버라이딩 된 '알바하다'가 나올까?

//        f.play(); // 사용불가
//
//
//
        Son s = (Son)f;
        s.work();
        s.study();
        s.play();
    }
}
