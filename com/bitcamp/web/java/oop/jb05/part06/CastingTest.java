package com.bitcamp.web.java.oop.jb05.part06;

public class CastingTest {
    public static void main(String[] args) {

//        Father father = new Father();
//        father.study();
//        father.work();
//        System.out.println("===============");

//        Son son = new Son();
//        son.study();// ����
//        son.work();//�������̵�
//        son.play();//son�޼���
//        System.out.println("===============");

        Father f = new Son();
        f.study();
        f.work();   // �� Son���� �������̵� �� '�˹��ϴ�'�� ���ñ�?

//        f.play(); // ���Ұ�
//
//
//
        Son s = (Son)f;
        s.work();
        s.study();
        s.play();
    }
}
