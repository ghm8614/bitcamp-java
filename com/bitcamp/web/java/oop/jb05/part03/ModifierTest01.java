package com.bitcamp.web.java.oop.jb05.part03;

// Modifier / Access Modifier �� Ȱ�� Ȯ��

// Secret�� number�� �ܺο��� ���� �� ���氡�� -> information hiding �����ʴ� ������
class TopSecret01 {

    //Field
    int secretNo = 7777;

    //Constructor
    public TopSecret01() {
    }

    //Method (getter)
    public int getSecretNo() {
        return secretNo;
    }
}//end of class

public class ModifierTest01 {

    //Main
    public static void main(String[] args) {
        TopSecret01 topSecret = new TopSecret01();
        System.out.println("topSecret.secretNo: " + topSecret.secretNo);

        topSecret.secretNo = 1234; // ����
        System.out.println("topSecret.secretNo: " + topSecret.secretNo);

    }//end of main
}//end of class
