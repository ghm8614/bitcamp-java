package com.bitcamp.web.java.oop.jb05.part06;

public class CastingComplete {
    public static void main(String[] args) {

        System.out.println("Super s1 = new Super();");
        Super s1 = new Super();
        s1.a();
        System.out.println("======================");

        System.out.println("Sub s2 = new Sub();");
        Sub s2 = new Sub();
        s2.a();
        s2.b();
        System.out.println("======================");


        // �߿�

        // ������ ����ȯ
        // ����Ŭ������ ����Ŭ������ ����(����)�ϰ� Ȯ���ϹǷ� ����Ŭ������ �� ū Ÿ�԰�����,
        // ���������� �� ū Ÿ���� ����Ŭ����.
        // �׷��� ������ �ν��Ͻ��� ����Ÿ�Կ� ���԰���

        // ���� Ÿ������ ���� �ν��Ͻ� ���� (�ν��Ͻ��� ������Ÿ�� ����)
        System.out.println("Super s3 = new Sub();");
        Super s3 = new Sub();   // ������ ����ȯ
        s3.a();
        //s3.b(); // compile error (s3�� b()�� ������ �� ����.)  ????

        System.out.println("s3�� b()�� ���� �Ұ�");
        System.out.println("���� �ڱ� �ڽ����� ����� ����ȯ�� ���� ���ƿ;� ��.");
        Sub sub = (Sub) s3;
        sub.b();

    }
}
