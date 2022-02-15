package com.bitcamp.web.java.oop.jb04.part03;

// 상속(일반화관계)과 생성자와의 관계
// 생성자를 명시적으로 호출하는 this() method의 이해
public class Employee {

    String name;
    String part;
    int age;
    int baseSalary;

    // Constructor
    public Employee() {
        System.out.println("Employee Class default Constructor");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("Employee Class:  name 속성을 초기화해주는 Constructor");
    }

    public Employee(String name, String part) {
        this(name);
        this.part = part;
        System.out.println("Employee Class: name, part 속성을 초기화해주는 Constructor");
    }

    public Employee(String name, String part, int age) {
        this(name, part);
        this.age = age;
        System.out.println("Employee Class: name, part, age 속성을 초기화해주는 Constructor");
    }

    public int salary() {
        System.out.println(" salary method !");
        baseSalary = 100;
        return baseSalary;
    }
}
