package com.bitcamp.web.java.oop.jb04.part05;

// 상위 클래스의 필드, 메서드를 호출할 수 있는 키워드 super
// 하위 클래스의 필드, 메서드를 호출할 수 있는 키워드 this
class JuniorHighSchool {

    String name = "비트 중학교";

    public JuniorHighSchool() {
    }

    public void schoolName() {
        System.out.println("중학교 name = " + name);
    }
}// end of class

class HighSchool extends JuniorHighSchool {

    String name = "비트 고등학교";

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

        HighSchool hs2 = new HighSchool("강남비트 고등학교");
        hs2.schoolName();
    }
}
