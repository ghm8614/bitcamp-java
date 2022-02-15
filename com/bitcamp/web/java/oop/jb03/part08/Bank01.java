package com.bitcamp.web.java.oop.jb03.part08;

public class Bank01 {

    String userName;
    String bankName;
    int command;
    int balance;
    int money;

    public Bank01() {
    }

    public Bank01(String bankName, String userName) {
        this.bankName = bankName;
        this.userName = userName;
    }

    // command를 String type으로 바꾸는 이유 고민해보기
    public Bank01(String userName,String bankName,String command) {
        this.userName = userName;
        this.bankName = bankName;
        this.command = Integer.parseInt(command);
    }

    // money, command를 String type으로 바꾸는 이유 고민해보기
    public Bank01(String userName,String bankName,String command, String money) {
        this.userName = userName;
        this.bankName = bankName;
        this.command = Integer.parseInt(command);
        this.money = Integer.parseInt(money);
    }

    public void deposit() {
        balance += money;
        System.out.println(money + "원 입금");
    }

    public void displayMoney() {
        System.out.println("현재 잔액 : " + balance + "입니다.");
    }

    public static void main(String[] args) {
        // 유효성 체크
        if (args.length < 2) {
            System.out.println("[usage]: java Bank [customerName][bankName][option][money]");
            System.out.println("[usage]: 인자값이 최소 2개가 필요합니다.");
            System.exit(0);
        }

        System.out.println(args[0] + "님의 주거래 은행은 " + args[1] + "입니다.");
        Bank01 bank = new Bank01();

        switch (args.length) {
            case 2:
                bank = new Bank01(args[0], args[1]);
                break;
            case 4:
                bank = new Bank01(args[0], args[1], args[2], args[3]);
                bank.deposit();
                break;
            default:
                System.out.println("입력 인자 개수가 2, 4가 아닙니다.");
                // break 생략 가능?
        }
        bank.displayMoney();
    }
}
