package com.bitcamp.web.java.oop.jb05.part03;

// Modifier / Access Modifier �� Ȱ�� Ȯ��

// 1. final + class : ��ӺҰ�
// 2. final + variable(identifier) : secretNo readOnly ���·� �����
// 3. private + constructor : �ν��Ͻ� �����Ұ�
// 4. �ν��Ͻ� �����ϴ� static method ����� ����
final class TopSecret03 {// final + class : ��ӺҰ�

    //Field
    // ���������ڸ� ���� information hiding
    // final + variable : �� ����Ұ�
    private final int secretNo = 7777;

    //Constructor
    // private + constructor : �ν��Ͻ� ���� �Ұ�
    private TopSecret03() {
    }

    //Method (getter)
    // ������ �����ؾ߸�, secret number ���� ����
    public int getSecretNo(int pwd) {
        if (pwd == 0) {
            return secretNo;
        }
        return 0;
    }

    // static method�� �̿��Ͽ� �ν��Ͻ��� �����Ѵ�.
    // �ٸ� Ŭ�������� ��밡��
    // �� �̷���? �����ڿ� private���� �ν��Ͻ� ������ ���Ƴ��ұ� ������
    // �޼��带 ���� �ν��Ͻ� ����
    public static TopSecret03 getInstance() {
        TopSecret03 topSecret = new TopSecret03();
        return topSecret;
    }
}//end of class

public class ModifierTest03 {

    //Main
    public static void main(String[] args) {

        // �����ڿ� private : �ν��Ͻ� ���� �Ұ�
//        TopSecret03 topSecret = new TopSecret03();

        // ������ ��� �ν��Ͻ������޼���� �ν��Ͻ� ����
       TopSecret03 topSecret = TopSecret03.getInstance();
        System.out.println(topSecret.getSecretNo(0));
    }//end of main
}//end of class
