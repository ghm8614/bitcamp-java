package com.bitcamp.web.java.oop.jb03.part08;

// 생성자의 이해
// new A() 의 의미
public class User01 {
    String name = "홍길동";
    int javaLevel = 0;

    // 기본 생성자
    public User01() {
        System.out.println("Constructor Method");
    }

    public String getName() {
        return name;
    }

    public int getJavaLevel() {
        return javaLevel;
    }

    public static void main(String[] args) {

        User01 user = new User01();

//        User01 user;
//        System.out.println("================");
//        user = new User01();
//        System.out.println("================");
//        new User01();
//        System.out.println("================");
    }
}
