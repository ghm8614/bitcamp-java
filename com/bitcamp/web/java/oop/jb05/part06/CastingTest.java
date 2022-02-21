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
        f.work();   // �� Son���� �������̵� �� '�˹��ϴ�'�� ���ñ�?
        
        // ���Ұ�
//        f.study();
//        f.play();
        System.out.println("===============");

        Son s = (Son)f;
        s.work();
        s.study();
    }
}
