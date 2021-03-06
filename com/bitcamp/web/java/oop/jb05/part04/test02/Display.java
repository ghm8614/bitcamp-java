package com.bitcamp.web.java.oop.jb05.part04.test02;

// abstract Method/ abstract class 의 필요성과 이해

// abstract method : 해당 클래스에서 사용될 수 없는 메서드이며, 구체적이지 않다.(body 구현부가 없다)
// 상속한 하위클래스에서 Overriding을 통해 abstact method의 기능을 구체적으로 명시해야한다.

// abstract method가 존재하는 클래스는 사용할 수 없는 메서드를 하나 가지고 있기 때문에,
// 인스턴스 생성을 할 수 없고,
// 인스턴스를 생성할 수 없는 클래스임을 나타내는 abstact 키워드를 클래스 앞에 붙여준다.
abstract class BusCharge {

    String section;

    public BusCharge(String section) {
        this.section = section;
    }

    public void information() {
        System.out.println("버스 요금 안내");
    }

    // abstract method
    public abstract void charge();  // 다형성 : 하나의 인터페이스 -> 다양한 활용

}// end of class

class Student extends BusCharge {

    public Student() {
        super("학생");
    }

    // 오버라이딩
    @Override
    public void charge() {
        System.out.println("300원");
    }
}

class Adult extends BusCharge {

    public Adult() {
        super("일반인");
    }

    // 오버라이딩
    @Override
    public void charge() {
        System.out.println("500원");
    }
}

class Old extends BusCharge {

    public Old() {
        super("어르신");
    }
    
    // 오버라이딩
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
