package com.bitcamp.web.java.oop.jb04.part03;

// 상속(일반화관계)과 생성자와의 관계
// 생성자를 명시적으로 호출하는 super() method의 이해
public class Manager extends Employee {

    int salary;

    // Constructor
    public Manager() {
        System.out.println("Manager Class default Constructor");
    }

    public Manager(String name) {
        super(name);
        System.out.println("Manager Class: name 속성을 초기화해주는 Constructor");
    }

    public Manager(String name, String part) {
        this(name);
        this.part = part;   // this, super 같은 Employee 의 필드 part를 가리침
        System.out.println("Manager Class: name,part 속성을 초기화해주는 Constructor");
    }

    public Manager(String name, String part, int age) {
        super(name, part);
        this.age = age;  // this, super 같은 Employee 의 필드 age를 가리침
        System.out.println("Manager Class: name,part,age 속성을 초기화해주는 Constructor");
    }

    public Manager(String name, String part, int age, int salary) {
        this(name, part, age);
        this.salary = salary;
        System.out.println("Manager Class: name,part,age,salary 속성을 초기화해주는 Constructor");
    }

    public void callSalary() {
        System.out.println("Manager 기본급 : " + salary());
    }

    public static void main(String[] args) {

        Manager m1 = new Manager();
        System.out.println("=================================");
        Manager m2 = new Manager("홍길동");
        System.out.println("=================================");
        Manager m3 = new Manager("홍길동", "EJB");
        System.out.println("=================================");
        Manager m4 = new Manager("홍길동", "EJB", 20);
        System.out.println("=================================");
        Manager m5 = new Manager("홍길동", "EJB", 20, 300);

        System.out.println("=================================");
        System.out.println("overriding 된 salary 호출: " + m4.salary());
        m4.callSalary();

    }
}
