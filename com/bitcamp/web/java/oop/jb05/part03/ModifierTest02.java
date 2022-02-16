package com.bitcamp.web.java.oop.jb05.part03;

// Modifier / Access Modifier �� Ȱ�� Ȯ��

// Access Modifier�� ���� information hiding�� Method�� ���� ����
class TopSecret02 {

    //Field
    // ���������ڸ� ���� information hiding
    private int secretNo = 7777;

    //Constructor
    public TopSecret02() {
    }

    //Method (getter)
    // ������ �����ؾ߸�, secret number ���� ����
    public int getSecretNo(int pwd) {
        if (pwd == 0) {
            return secretNo;
        }
        return 0;
    }
}//end of class

public class ModifierTest02 {

    //Main
    public static void main(String[] args) {
        TopSecret02 topSecret = new TopSecret02();

        // private �ʵ��̹Ƿ� information hiding�Ǿ�����, ���� �� ���� �Ұ�
//        topSecret.secretNo = 1234;
//        System.out.println("topSecret.secretNo: " + topSecret.secretNo);

        System.out.println(topSecret.getSecretNo(0));
    }//end of main
}//end of class
