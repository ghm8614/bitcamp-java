package com.bitcamp.web.java.oop.jb04.part02;

// Human <- Iam <- Son
public class Son extends Iam {

    String school;

    public Son() {
        System.out.println("Son Class default Constructor");
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public static void main(String[] args) {

        // Constructor ��°�� Ȯ��
        Son son = new Son();

        System.out.println("=============================");
        // Human Class method
        son.setName("ȫ�浿");
        son.setAge(10);
        System.out.println("son.getName() = " + son.getName());
        System.out.println("son.getAge() = " + son.getAge());

        System.out.println("=============================");
        // Iam Class method
        son.setJob("������");
        System.out.println("son.getJob() = " + son.getJob());

        System.out.println("=============================");
        son.setSchool("������б�");
        System.out.println("son.getSchool() = " + son.getSchool());
    }
}
