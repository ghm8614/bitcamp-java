package com.bitcamp.web.java.oop.jb04.part07;

// Encapsulation(information hiding = ��������)�� �����ϴ� Access Modifier(����������)
// public/protected/  /private
public class Father {

    public String name = "ȫ�浿";
    protected String bank = "�ϳ�����";   //
    String branch = "��������";
    private int password = 1234;    //

    public Father() {
    }

    // �޼��带 ���� ������ �ʵ忡 ���� ����

    // pwd �� �����̸� ��������????
    public String getBank(int pwd) {
        if (pwd != 7777) {
            return "key ���� ��Ȯ�� �Է��ϼ���.";
        }
        return this.bank;
    }

    // key �� ���� ��й�ȣ ��������
    public int getPassword(int key) {
        if (key != 7777) {
            return 0;
        }
        return this.password;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

}
