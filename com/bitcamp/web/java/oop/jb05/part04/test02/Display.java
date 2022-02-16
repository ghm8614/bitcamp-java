package com.bitcamp.web.java.oop.jb05.part04.test02;

// abstract Method/ abstract class 의 필요성과 이해

// abstract class 상속 시, abstract method 반드시 오버라이딩 해야한다.
// 추상 클래스로 인스턴스 생성불가
abstract class BusCharge {

    String section;

    public BusCharge(String section) {
        this.section = section;
    }

    public void information() {
        System.out.println("버스 요금 안내");
    }

    // abstract method
    public abstract void charge();

}// end of class

class Student extends BusCharge {

    public Student() {
        super("학생");
    }

    // 구현하지 않을 시, 컴파일 에러
    @Override
    public void charge() {
        System.out.println("300원");
    }
}

class Adult extends BusCharge {

    public Adult(){
        super("일반인");
    }

    // 반드시 오버라이딩
    @Override
    public void charge() {
        System.out.println("500원");

    }
}

class Old extends BusCharge {

    public Old() {
        super("어르신");
    }

    @Override
    public void charge() {
        System.out.println("무료");
    }
}
public class Display {

    //Main
    public static void main(String[] args) {

        Student b1 = new Student();
        Adult b2 = new Adult();
        Old b3 = new Old();

        b1.information();
        System.out.println(b1.section);
        b1.charge();

        b2.information();
        System.out.println(b2.section);
        b2.charge();

        b3.information();
        System.out.println(b3.section);
        b3.charge();
    }
}
