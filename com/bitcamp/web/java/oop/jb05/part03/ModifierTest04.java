package com.bitcamp.web.java.oop.jb05.part03;

// Modifier / Access Modifier �� Ȱ�� Ȯ��

final class TopSecret04 {// final + class : ��ӺҰ�

    private final int secretNo = 7777;

    private TopSecret04() {
    }

    public int getSecretNo(int pwd) {
        if (pwd == 0) {
            return secretNo;
        }
        return 0;
    }

    // �߰�����
    public static TopSecret04 getInstance(int managerNo) {
        if (managerNo == 1234) {
            return new TopSecret04();
        }
        return null;
    }
}//end of class

public class ModifierTest04 {

    //Main
    public static void main(String[] args) {

        // ������ ��� �ν��Ͻ������޼���� �ν��Ͻ� ����
       TopSecret04 topSecret = TopSecret04.getInstance(1234);
        System.out.println(topSecret.getSecretNo(0));
    }//end of main
}//end of class
