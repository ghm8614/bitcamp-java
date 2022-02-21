package com.bitcamp.web.java.oop.jb05.part08;

public class HanmiBank extends Bank implements Deposit, Payout {

    public HanmiBank() {
    }

    public HanmiBank(String name) {
        super(name);
    }

    //Method
    // Bank �߻�Ŭ������ �߻�޼��� ����
    @Override
    public void display() {
        System.out.println("����� : " + this.getName());
    }

    // deposit �������̽��� ��ɱ���
    @Override
    public void deposit(int money) {
        System.out.println(money + "�� �Ա��մϴ�.");
    }

    // payout �������̽��� ��ɱ���
    @Override
    public void payOut(int money) {
        System.out.println(money + "�� ����մϴ�.");
    }

    //Main
    public static void main(String[] args) {
        HanmiBank hb = new HanmiBank("�ѹ�����");
        hb.display();
        hb.deposit(100);
        hb.payOut(200);

        System.out.println(Payout.payOut);
        System.out.println(Deposit.deposit);

        // �������̽��� ����Ǵ� �ʵ�� final static�̶� ����Ұ�
//        Deposit.deposit = "11";
//        Payout.payOut="111";
    }
}
