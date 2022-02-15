package com.bitcamp.web.java.oop.jb04.part03;

// ���(�Ϲ�ȭ����)�� �����ڿ��� ����
// �����ڸ� ��������� ȣ���ϴ� this() method�� ����
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
        System.out.println("Employee Class:  name �Ӽ��� �ʱ�ȭ���ִ� Constructor");
    }

    public Employee(String name, String part) {
        this(name);
        this.part = part;
        System.out.println("Employee Class: name, part �Ӽ��� �ʱ�ȭ���ִ� Constructor");
    }

    public Employee(String name, String part, int age) {
        this(name, part);
        this.age = age;
        System.out.println("Employee Class: name, part, age �Ӽ��� �ʱ�ȭ���ִ� Constructor");
    }

    public int salary() {
        System.out.println(" salary method !");
        baseSalary = 100;
        return baseSalary;
    }
}
