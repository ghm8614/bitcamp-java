package com.bitcamp.web.java.oop.jb04.part07.outer;

import com.bitcamp.web.java.oop.jb04.part07.Father;

// Father과 다른 패키지, 상속 x
public class Other {

    String name = "홍길동";
    String job = new String("개발자");

    Father unknown = new Father();

    public Other() {
        System.out.println(this.unknown.name);
//        System.out.println(owner.bank);
//        System.out.println(owner.branch);
//        System.out.println(owner.password);
    }
}
