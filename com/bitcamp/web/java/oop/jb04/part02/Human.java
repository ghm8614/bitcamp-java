package com.bitcamp.web.java.oop.jb04.part02;

// 최상위 클래스
// 추상화 수준이 높은, 일반적인 사항(특성,행위)을 모델링한 클래스
public class Human {

    String name;
    int age;


    // Constructor
    public Human() {
        System.out.println("Human Class default Constructor");
    }

    public Human(String name) {
        System.out.println("Human Class의 name필드 초기화하는 Constructor");
        this.name = name;
    }


    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
