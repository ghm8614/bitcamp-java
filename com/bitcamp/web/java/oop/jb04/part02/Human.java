package com.bitcamp.web.java.oop.jb04.part02;

// �ֻ��� Ŭ����
// �߻�ȭ ������ ����, �Ϲ����� ����(Ư��,����)�� �𵨸��� Ŭ����
public class Human {

    String name;
    int age;


    // Constructor
    public Human() {
        System.out.println("Human Class default Constructor");
    }

    public Human(String name) {
        System.out.println("Human Class�� name�ʵ� �ʱ�ȭ�ϴ� Constructor");
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
