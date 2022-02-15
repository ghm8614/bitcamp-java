package com.bitcamp.web.java.oop.jb03.part08;

// 생성자의 이해

// 생성자는 인스턴스 생성시 호출된다.
// 주 작업은 Field variable 초기화 작업이다. (상태값 설정)
// 생성시 상태를 갖는 인스턴스 생성

public class User02 {
    String name;
    int javaLevel;

    // 변동사항
    public User02() {
        System.out.println("Constructor Method");
        name = "홍길동";
        javaLevel = 0;
    }

    public String getName() {
        return name;
    }

    public int getJavaLevel() {
        return javaLevel;
    }


    public static void main(String[] args) {
        User02 user = new User02();
        System.out.println("user.getName() = " + user.getName());
        System.out.println("user.getJavaLevel() = " + user.getJavaLevel());
    }
}
