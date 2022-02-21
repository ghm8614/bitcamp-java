package com.bitcamp.web.java.oop.jb05.part07;

// Interface = pure abstract class

// abstract methods 의 집합 (기능만 정의하고 하위클래스에서 오버라이딩 강요)
// interface 에서는 모두가 abstract 이기 때문에, abstract 키워드를 붙이지 않는다.
// 인스턴스 생성 불가

abstract class BusCharge {

    String section;

    public BusCharge(String section) {
        this.section = section;
    }

    public void information() {
        System.out.println("버스 요금 안내");
    }

}

// 추가된 interface
interface Fee{
    public abstract void charge();
}

// 추상메서드 반드시 구현
class Student extends BusCharge implements Fee{

    public Student() {
        super("학생");
    }

    @Override
    public void charge() {
        System.out.println("300원");
    }
}

class Adult extends BusCharge implements Fee{

    public Adult() {
        super("일반인");
    }

    // 반드시 오버라이딩
    @Override
    public void charge() {
        System.out.println("500원");

    }
}

class Old extends BusCharge implements Fee{

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

        // 컴파일 에러
        /*
        Fee[] fee = new Fee[3];
        fee[0] = new Student();
        fee[1] = new Adult();
        fee[2] = new Old();
         */
    }
}
