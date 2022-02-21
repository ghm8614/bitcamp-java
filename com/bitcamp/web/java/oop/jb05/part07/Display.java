package com.bitcamp.web.java.oop.jb05.part07;

// Interface = pure abstract class

// abstract methods �� ���� (��ɸ� �����ϰ� ����Ŭ�������� �������̵� ����)
// interface ������ ��ΰ� abstract �̱� ������, abstract Ű���带 ������ �ʴ´�.
// �ν��Ͻ� ���� �Ұ�

abstract class BusCharge {

    String section;

    public BusCharge(String section) {
        this.section = section;
    }

    public void information() {
        System.out.println("���� ��� �ȳ�");
    }

}

// �߰��� interface
interface Fee{
    public abstract void charge();
}

// �߻�޼��� �ݵ�� ����
class Student extends BusCharge implements Fee{

    public Student() {
        super("�л�");
    }

    @Override
    public void charge() {
        System.out.println("300��");
    }
}

class Adult extends BusCharge implements Fee{

    public Adult() {
        super("�Ϲ���");
    }

    // �ݵ�� �������̵�
    @Override
    public void charge() {
        System.out.println("500��");

    }
}

class Old extends BusCharge implements Fee{

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

        // ������ ����
        /*
        Fee[] fee = new Fee[3];
        fee[0] = new Student();
        fee[1] = new Adult();
        fee[2] = new Old();
         */
    }
}
