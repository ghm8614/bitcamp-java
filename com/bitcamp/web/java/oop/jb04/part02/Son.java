package com.bitcamp.web.java.oop.jb04.part02;

// Human <- Iam <- Son
public class Son extends Iam {

    String school;

    public Son() {
        System.out.println("Son Class default Constructor");
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public static void main(String[] args) {

        // Constructor 출력결과 확인
        Son son = new Son();

        System.out.println("=============================");
        // Human Class method
        son.setName("홍길동");
        son.setAge(10);
        System.out.println("son.getName() = " + son.getName());
        System.out.println("son.getAge() = " + son.getAge());

        System.out.println("=============================");
        // Iam Class method
        son.setJob("개발자");
        System.out.println("son.getJob() = " + son.getJob());

        System.out.println("=============================");
        son.setSchool("서울대학교");
        System.out.println("son.getSchool() = " + son.getSchool());
    }
}
