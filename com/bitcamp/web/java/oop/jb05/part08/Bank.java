package com.bitcamp.web.java.oop.jb05.part08;

// 추상 클래스 : 인터페이스(기능 정의)와 달리 일반 method와 field를 갖을 수 있다.
public abstract class Bank {

    private String name;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
