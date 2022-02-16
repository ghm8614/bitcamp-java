package com.bitcamp.web.java.oop.jb05.part04.test02;

// abstract Method/ abstract class �� �ʿ伺�� ����

// abstract class ��� ��, abstract method �ݵ�� �������̵� �ؾ��Ѵ�.
// �߻� Ŭ������ �ν��Ͻ� �����Ұ�
abstract class BusCharge {

    String section;

    public BusCharge(String section) {
        this.section = section;
    }

    public void information() {
        System.out.println("���� ��� �ȳ�");
    }

    // abstract method
    public abstract void charge();

}// end of class

class Student extends BusCharge {

    public Student() {
        super("�л�");
    }

    // �������� ���� ��, ������ ����
    @Override
    public void charge() {
        System.out.println("300��");
    }
}

class Adult extends BusCharge {

    public Adult(){
        super("�Ϲ���");
    }

    // �ݵ�� �������̵�
    @Override
    public void charge() {
        System.out.println("500��");

    }
}

class Old extends BusCharge {

    public Old() {
        super("���");
    }

    @Override
    public void charge() {
        System.out.println("����");
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