package com.bitcamp.web.java.oop.jb04.part03;

// ���(�Ϲ�ȭ����)�� �����ڿ��� ����
// �����ڸ� ��������� ȣ���ϴ� super() method�� ����
public class Manager extends Employee {

    int salary;

    // Constructor
    public Manager() {
        System.out.println("Manager Class default Constructor");
    }

    public Manager(String name) {
        super(name);
        System.out.println("Manager Class: name �Ӽ��� �ʱ�ȭ���ִ� Constructor");
    }

    public Manager(String name, String part) {
        this(name);
        this.part = part;   // this, super ���� Employee �� �ʵ� part�� ����ħ
        System.out.println("Manager Class: name,part �Ӽ��� �ʱ�ȭ���ִ� Constructor");
    }

    public Manager(String name, String part, int age) {
        super(name, part);
        this.age = age;  // this, super ���� Employee �� �ʵ� age�� ����ħ
        System.out.println("Manager Class: name,part,age �Ӽ��� �ʱ�ȭ���ִ� Constructor");
    }

    public Manager(String name, String part, int age, int salary) {
        this(name, part, age);
        this.salary = salary;
        System.out.println("Manager Class: name,part,age,salary �Ӽ��� �ʱ�ȭ���ִ� Constructor");
    }

    public void callSalary() {
        System.out.println("Manager �⺻�� : " + salary());
    }

    public static void main(String[] args) {

        Manager m1 = new Manager();
        System.out.println("=================================");
        Manager m2 = new Manager("ȫ�浿");
        System.out.println("=================================");
        Manager m3 = new Manager("ȫ�浿", "EJB");
        System.out.println("=================================");
        Manager m4 = new Manager("ȫ�浿", "EJB", 20);
        System.out.println("=================================");
        Manager m5 = new Manager("ȫ�浿", "EJB", 20, 300);

        System.out.println("=================================");
        System.out.println("overriding �� salary ȣ��: " + m4.salary());
        m4.callSalary();

    }
}
