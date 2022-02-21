package com.bitcamp.web.java.oop.jb05.part08;

// 입금 기능을 interface에 정의
public interface Deposit {

    // 인터페이스 field -> 자동으로 static final 이 적용됨
    String deposit = "입금";

    // 인터페이스 method
    void deposit(int money);
}
