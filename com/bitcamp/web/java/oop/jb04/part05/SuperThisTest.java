package com.bitcamp.web.java.oop.jb04.part05;

// ���� Ŭ������ �ʵ�, �޼��带 ȣ���� �� �ִ� Ű���� super
// ���� Ŭ������ �ʵ�, �޼��带 ȣ���� �� �ִ� Ű���� this
class JuniorHighSchool {

    String name = "��Ʈ ���б�";

    public JuniorHighSchool() {
    }

    public void schoolName() {
        System.out.println("���б� name = " + name);
    }
}// end of class

class HighSchool extends JuniorHighSchool {

    String name = "��Ʈ ����б�";

    public HighSchool() {
    }

    public HighSchool(String name) {
        this.name = name;
    }

    public void schoolName() {
        System.out.println("super.name = " + super.name);
        System.out.println("this.name = " + this.name);
        System.out.println("name = " + name);
    }
}// end of class

public class SuperThisTest {
    public static void main(String[] args) {
        HighSchool hs1 = new HighSchool();
        hs1.schoolName();

        System.out.println("=====================");

        HighSchool hs2 = new HighSchool("������Ʈ ����б�");
        hs2.schoolName();
    }
}
