package com.bitcamp.web.java.oop.jb04.part07;

// Father�� ���� ��Ű��, ��� x
public class Other {

    String name = "ȫ�浿";
    String job = new String("������");

    Father owner = new Father();

    public Other() {
        System.out.println(this.owner.name);
        System.out.println(owner.bank);     // ���� ��Ű����, ��Ӿȹ޾Ƶ� protected ����
        System.out.println(owner.branch);
//        System.out.println(owner.password);
    }
}
