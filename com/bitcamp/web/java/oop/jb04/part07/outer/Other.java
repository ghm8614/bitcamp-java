package com.bitcamp.web.java.oop.jb04.part07.outer;

import com.bitcamp.web.java.oop.jb04.part07.Father;

// Father�� �ٸ� ��Ű��, ��� x
public class Other {

    String name = "ȫ�浿";
    String job = new String("������");

    Father unknown = new Father();

    public Other() {
        System.out.println(this.unknown.name);
//        System.out.println(owner.bank);
//        System.out.println(owner.branch);
//        System.out.println(owner.password);
    }
}
