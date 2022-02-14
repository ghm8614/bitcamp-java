package com.bitcamp.web.java.oop;

// 생성자의 이해

// 생성자 오버로딩
public class User03 {
    String name;
    int javaLevel;

    public User03() {
        System.out.println("default Constructor");
        name = "홍길동";
        javaLevel = 0;
    }

    // 추가사항
    public User03(String str) {
        System.out.println("String을 인자로 받아 name을 초기화하는 생성자");
        name = str;
    }

    // 추가사항
    public User03(int i) {
        System.out.println("int을 인자로 받아 javaLevel를 초기화하는 생성자");
        javaLevel = i;
    }

    // 추가사항
    public User03(String str, int i) {
        System.out.println("String,int을 인자로 받아 field 모두를 초기화하는 생성자");
        name = str;
        javaLevel = i;
    }

    public String getName() {
        return name;
    }

    public int getJavaLevel() {
        return javaLevel;
    }


    public static void main(String[] args) {
        User03 user1 = new User03();
        System.out.println("user.getName() = " + user1.getName());
        System.out.println("user.getJavaLevel() = " + user1.getJavaLevel());

        User03 user2 = new User03("박철수");
        System.out.println("user.getName() = " + user1.getName());
        System.out.println("user.getJavaLevel() = " + user1.getJavaLevel());

        User03 user3 = new User03(100);
        System.out.println("user.getName() = " + user1.getName());
        System.out.println("user.getJavaLevel() = " + user1.getJavaLevel());

        User03 user4 = new User03("김철수", 200);
        System.out.println("user.getName() = " + user1.getName());
        System.out.println("user.getJavaLevel() = " + user1.getJavaLevel());
    }
}
