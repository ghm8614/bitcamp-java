package com.bitcamp.web.java.oop.jb05.part08;

public class HanmiBank extends Bank implements Deposit, Payout {

    public HanmiBank() {
    }

    public HanmiBank(String name) {
        super(name);
    }

    //Method
    // Bank 추상클래스의 추상메서드 구현
    @Override
    public void display() {
        System.out.println("은행명 : " + this.getName());
    }

    // deposit 인터페이스의 기능구현
    @Override
    public void deposit(int money) {
        System.out.println(money + "을 입금합니다.");
    }

    // payout 인터페이스의 기능구현
    @Override
    public void payOut(int money) {
        System.out.println(money + "을 출금합니다.");
    }

    //Main
    public static void main(String[] args) {
        HanmiBank hb = new HanmiBank("한미은행");
        hb.display();
        hb.deposit(100);
        hb.payOut(200);

        System.out.println(Payout.payOut);
        System.out.println(Deposit.deposit);

        // 인터페이스에 선언되는 필드는 final static이라 변경불가
//        Deposit.deposit = "11";
//        Payout.payOut="111";
    }
}
