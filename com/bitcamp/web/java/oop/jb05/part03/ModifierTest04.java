package com.bitcamp.web.java.oop.jb05.part03;

// Modifier / Access Modifier 의 활용 확인

final class TopSecret04 {// final + class : 상속불가

    private final int secretNo = 7777;

    private TopSecret04() {
    }

    public int getSecretNo(int pwd) {
        if (pwd == 0) {
            return secretNo;
        }
        return 0;
    }

    // 추가사항
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

        // 생성자 대신 인스턴스생성메서드로 인스턴스 생성
       TopSecret04 topSecret = TopSecret04.getInstance(1234);
        System.out.println(topSecret.getSecretNo(0));
    }//end of main
}//end of class
