package com.bitcamp.web.java.oop.jb04.part04;

class BusCharge {

    String section;

    public BusCharge() {
    }

    public BusCharge(String section) {
        this.section = section;
    }

    public void information() {
        System.out.println("버스요금 안내");
    }

    public void charge() {
        System.out.println("학생 300, 일반인 500, 어르신 무료");
    }
}   // end of class

class Student extends BusCharge {

    public Student() {
        super("학생");
    }

    public void charge() {
        System.out.println("300원");
    }
}   // end of class

class Adult extends BusCharge {

    public Adult() {
        super("일반인");
    }

    public void charge() {
        System.out.println("500원");
    }
}   // end of class

class Old extends BusCharge {

    public Old() {
        super("어르신");
    }

    public void charge() {
        System.out.println("무료");
    }
}   // end of class


public class Display {
    public static void main(String[] args) {
        Student student = new Student();
        Adult adult = new Adult();
        Old old = new Old();

        student.information();
        System.out.println(student.section); // 인스턴스 생성 시, 생성자를 통해 설정된 필드값
        student.charge();   // 오버라이딩

        System.out.println("========================");
        adult.information();
        System.out.println(adult.section); // 인스턴스 생성 시, 생성자를 통해 설정된 필드값
        adult.charge();    // 오버라이딩

        System.out.println("========================");
        old.information();
        System.out.println(old.section); // 인스턴스 생성 시, 생성자를 통해 설정된 필드값
        old.charge();   // 오버라이딩
    }
}
