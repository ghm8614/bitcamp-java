package com.bitcamp.web.java.oop.jb04.part02;

// Human <- Iam
// Human Class �� �Ϲ�ȭ ����
// Human Class �� �Ӽ��� ������ �����ϸ�, ��ü���� �Ӽ��� ������ ���´� (Ȯ���Ѵ�.)
public class Iam extends Human {

    String job;

    // Constructor
    public Iam() {
        System.out.println("Iam Class default Constructor");
    }

    // setter
    public void setJob(String job) {
        this.job = job;
    }

    // getter
    public String getJob() {
        return job;
    }

    public static void main(String[] args) {

        // �ν��Ͻ� ���� ��, ��°�� Ȯ��
        // OOP�� �Ϲ�ȭ������ �Ӽ��� ������ ���� �����ϱ�
        // Constructor ��°�� Ȯ��
        Iam iam = new Iam();

        System.out.println("=============================");
        // ��ӹ��� Human Class method
        iam.setName("ȫ�浿");
        iam.setAge(13);
        System.out.println("iam.getName() = " + iam.getName());
        System.out.println("iam.getAge() = " + iam.getAge());

        System.out.println("=============================");
        iam.setJob("������");
        System.out.println("iam.getJob() = " + iam.getJob());
    }
}
