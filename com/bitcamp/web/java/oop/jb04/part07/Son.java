package com.bitcamp.web.java.oop.jb04.part07;

// Father�� ���� ��Ű��, ��� o
public class Son extends Father {

    public Son() {
        System.out.println(this.name);
        System.out.println(bank);
        System.out.println(branch);

        // 1. private �ʵ忡 ���� ���� �Ұ�
//        System.out.println(password);

        // 2. �޼��忡 �ùٸ� key�� �Է� �ÿ�, ���ٰ���
        getPassword(0);
    }
}
