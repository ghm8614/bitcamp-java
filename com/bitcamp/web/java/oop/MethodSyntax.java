package com.bitcamp.web.java.oop;

// 객체간의 행위를 정의하는 Method
// OOP에서 method란 객체간 data를 전달하거나 받을 수 있는 수단
// OOP는 객체와 객체간 통신은 method 호출
public class MethodSyntax {

    String name = "홍길동";
    String address = "한양";

    public void browserOn() {
        System.out.println("browser 켜다");
    }

    public boolean documentWork() {
        System.out.println("document 작업을 하고 작업완성 유무를 리턴");
        return true;
    }

    public int sum(int i, int j) {
        System.out.println("입력받은 값의 합 리턴");
        return i + j;
    }

    public String getName() {
        System.out.println("이름 전달");
        return name;
    }

    public String getAddress() {
        System.out.println("주소 전달");
        return address;
    }

    // 이름과 주소를 배열에 담아 리턴
    public String[] getAllInformation() {
        String[] str = {name, address};
        return str;
    }
}
