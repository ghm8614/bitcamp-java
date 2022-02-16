package com.bitcamp.web.java.oop.jb05.part03;

// Modifier / Access Modifier 의 활용 확인

// 1. final + class : 상속불가
// 2. final + variable(identifier) : secretNo readOnly 상태로 만들기
// 3. private + constructor : 인스턴스 생성불가
// 4. 인스턴스 리턴하는 static method 만들기 가능
final class TopSecret03 {// final + class : 상속불가

    //Field
    // 접근제어자를 통한 information hiding
    // final + variable : 값 변경불가
    private final int secretNo = 7777;

    //Constructor
    // private + constructor : 인스턴스 생성 불가
    private TopSecret03() {
    }

    //Method (getter)
    // 조건을 충족해야만, secret number 리턴 가능
    public int getSecretNo(int pwd) {
        if (pwd == 0) {
            return secretNo;
        }
        return 0;
    }

    // static method를 이용하여 인스턴스를 리턴한다.
    // 다른 클래스에서 사용가능
    // 왜 이렇게? 생성자에 private으로 인스턴스 생성을 막아놓았기 때문에
    // 메서드를 통한 인스턴스 생성
    public static TopSecret03 getInstance() {
        TopSecret03 topSecret = new TopSecret03();
        return topSecret;
    }
}//end of class

public class ModifierTest03 {

    //Main
    public static void main(String[] args) {

        // 생성자에 private : 인스턴스 생성 불가
//        TopSecret03 topSecret = new TopSecret03();

        // 생성자 대신 인스턴스생성메서드로 인스턴스 생성
       TopSecret03 topSecret = TopSecret03.getInstance();
        System.out.println(topSecret.getSecretNo(0));
    }//end of main
}//end of class
