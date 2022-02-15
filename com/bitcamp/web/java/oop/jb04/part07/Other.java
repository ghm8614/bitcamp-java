package com.bitcamp.web.java.oop.jb04.part07;

// Father과 같은 패키지, 상속 x
public class Other {

    String name = "홍길동";
    String job = new String("개발자");

    Father owner = new Father();

    public Other() {
        System.out.println(this.owner.name);
        System.out.println(owner.bank);     // 같은 패키지면, 상속안받아도 protected 가능
        System.out.println(owner.branch);
//        System.out.println(owner.password);
    }
}
