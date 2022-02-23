package com.bitcamp.web.java.oop.jp02.part04;

public class FindOddException extends Exception{
    //F

    //C
    public FindOddException() {
        System.out.println("-> FindOddException Default Constructor");
    }

    public FindOddException(String msg) {
        super(msg);
        System.out.println("-> 인자가 있는 FindOddException Constructor");
    }
}
