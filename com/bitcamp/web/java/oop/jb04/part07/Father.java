package com.bitcamp.web.java.oop.jb04.part07;

// Encapsulation(information hiding = 정보은닉)을 지원하는 Access Modifier(접근제어자)
// public/protected/  /private
public class Father {

    public String name = "홍길동";
    protected String bank = "하나은행";   //
    String branch = "강남지점";
    private int password = 1234;    //

    public Father() {
    }

    // 메서드를 통해 각각의 필드에 접근 가능

    // pwd 로 은행이름 가져오기????
    public String getBank(int pwd) {
        if (pwd != 7777) {
            return "key 값을 정확히 입력하세요.";
        }
        return this.bank;
    }

    // key 로 은행 비밀번호 가져오기
    public int getPassword(int key) {
        if (key != 7777) {
            return 0;
        }
        return this.password;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

}
