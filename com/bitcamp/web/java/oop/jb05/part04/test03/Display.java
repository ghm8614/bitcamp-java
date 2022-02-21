package com.bitcamp.web.java.oop.jb05.part04.test03;

// abstract Method/ abstract class 의 필요성과 이해

// 상위클래스 타입으로 하위 인스턴스를 참조가능
// 참조자료형의 묵시적 형변환
// 다형성 : 하나의 인터페이스 -> 다양한 활용
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

    @Override
    public void charge() {
        System.out.println("300원");
    }
}

class Adult extends BusCharge {

    public Adult(){
        super("일반인");
    }

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

        // 변경된 부분
        BusCharge b1 = new Student();
        BusCharge b2 = new Adult();
        BusCharge b3 = new Old();

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
