package com.bitcamp.web.java.oop.jb05.part08;

// �߻� Ŭ���� : �������̽�(��� ����)�� �޸� �Ϲ� method�� field�� ���� �� �ִ�.
public abstract class Bank {

    private String name;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
