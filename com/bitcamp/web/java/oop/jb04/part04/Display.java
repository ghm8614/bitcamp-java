package com.bitcamp.web.java.oop.jb04.part04;

class BusCharge {

    String section;

    public BusCharge() {
    }

    public BusCharge(String section) {
        this.section = section;
    }

    public void information() {
        System.out.println("������� �ȳ�");
    }

    public void charge() {
        System.out.println("�л� 300, �Ϲ��� 500, ��� ����");
    }
}   // end of class

class Student extends BusCharge {

    public Student() {
        super("�л�");
    }

    public void charge() {
        System.out.println("300��");
    }
}   // end of class

class Adult extends BusCharge {

    public Adult() {
        super("�Ϲ���");
    }

    public void charge() {
        System.out.println("500��");
    }
}   // end of class

class Old extends BusCharge {

    public Old() {
        super("���");
    }

    public void charge() {
        System.out.println("����");
    }
}   // end of class


public class Display {
    public static void main(String[] args) {
        Student student = new Student();
        Adult adult = new Adult();
        Old old = new Old();

        student.information();
        System.out.println(student.section); // �ν��Ͻ� ���� ��, �����ڸ� ���� ������ �ʵ尪
        student.charge();   // �������̵�

        System.out.println("========================");
        adult.information();
        System.out.println(adult.section); // �ν��Ͻ� ���� ��, �����ڸ� ���� ������ �ʵ尪
        adult.charge();    // �������̵�

        System.out.println("========================");
        old.information();
        System.out.println(old.section); // �ν��Ͻ� ���� ��, �����ڸ� ���� ������ �ʵ尪
        old.charge();   // �������̵�
    }
}
