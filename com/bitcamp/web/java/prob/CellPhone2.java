package com.bitcamp.web.java.prob;

import java.util.Objects;

public class CellPhone2 {

    //F
    String model;   // �ڵ��� �� ��ȣ
    double battery; // ���� ���͸�

    //C
    public CellPhone2() {
    }

    public CellPhone2(String model) {
        this.model = model;
    }

    //M
    public void call(int time) {
        System.out.println("��ȭ �ð� : " + time + "��");

        this.battery -= time * 0.5;
        if (battery < 0) {
            battery = 0;
        }

        if (time < 0) {
            throw new IllegalArgumentException("��ȭ�ð� �Է¿���");
        }
    }


    public void charge(int time) {
        System.out.println("���� �ð� : " + time + "��");

        this.battery += time * 3;
        if (battery > 0) {
            battery = 100;
        }

        if (time < 0) {
            throw new IllegalArgumentException("�����ð� �Է¿���");
        }
    }

    public void printBattery() {
        System.out.println("���� ���͸� �� : " + this.battery);
    }

    // equals() �������̵�..
}
