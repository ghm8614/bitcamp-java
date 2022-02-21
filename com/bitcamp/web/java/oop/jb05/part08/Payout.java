package com.bitcamp.web.java.oop.jb05.part08;

// 출금 기능을 interface에 정의
public interface Payout {

    // 인터페이스 field -> public final static 특성을 갖는다.
    public final static String payOut = "출금";

    // 인터페이스 method -> public abstract 특성을 갖는다.
    public abstract void payOut(int money);
}
