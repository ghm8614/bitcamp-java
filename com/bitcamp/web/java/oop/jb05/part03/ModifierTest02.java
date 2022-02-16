package com.bitcamp.web.java.oop.jb05.part03;

// Modifier / Access Modifier 의 활용 확인

// Access Modifier를 통한 information hiding과 Method를 통한 접근
class TopSecret02 {

    //Field
    // 접근제어자를 통한 information hiding
    private int secretNo = 7777;

    //Constructor
    public TopSecret02() {
    }

    //Method (getter)
    // 조건을 충족해야만, secret number 리턴 가능
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

        // private 필드이므로 information hiding되어있음, 접근 및 변경 불가
//        topSecret.secretNo = 1234;
//        System.out.println("topSecret.secretNo: " + topSecret.secretNo);

        System.out.println(topSecret.getSecretNo(0));
    }//end of main
}//end of class
