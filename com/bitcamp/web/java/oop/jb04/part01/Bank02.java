package com.bitcamp.web.java.oop.jb04.part01;

public class Bank02 {

    String userName;
    String bankName;
    int command;
    int balance;
    int money;

    public Bank02() {
    }

    public Bank02(String bankName, String userName) {
        this.bankName = bankName;
        this.userName = userName;
    }

    // command, money를 String으로 입력받아 int로 바꾸는 이유 고민해보기
    public Bank02(String userName, String bankName, String command, String money) {
        this.userName = userName;
        this.bankName = bankName;
        this.command = Integer.parseInt(command);
        this.money = Integer.parseInt(money);
    }
    public void deposit() {
        balance += money;
        System.out.println(money + "원 입금");
    }
    public void withdraw() {
        balance -= money;
        System.out.println(money + "원 출금");
    }

    // 리팩토링 (수정한 부분)
    // 실행하는 main에서 조건문 사용하지 말고,
    // 자바빈에서 메서드로 묶은 후, main에서는 호출만
    // 객체지향적 코드 작성하기

    // 욥션 실행 메서드
    public void work() {
        if (command == 1) {
            deposit();
        } else if (command == 2) {
            withdraw();
        }
    }
    public void displayMoney() {
        System.out.println("현재 잔액 : " + balance + "입니다.");
    }
    // 인수 유효성 체크
    public void checkInvalidArgs(String[] args) {
        if (!(args.length == 2 || args.length == 4)) {
            System.out.println("[usage]: java Bank [customerName][bankName][option][money]");
            System.out.println("[usage]: 인자값이 2, 4개가 필요합니다.");
            System.exit(0);
        }
    }
    // 옵션(입금, 출금) 유효성 체크
    public void checkInvalidOption() {
        if (!(command == 1 || command == 2)) {
            System.out.println("[usage]: java Bank [customerName][bankName][option][money]");
            System.out.println("[usage]: Option 은 반드시 숫자 1(입금), 2(출금) 중 하나입니다.");
            System.exit(0);
        }
    }
    public void print(String[] args) {
        String userName = args[0];
        String bankName = args[1];
        System.out.println(userName + "님의 주거래 은행은 " + bankName + "입니다.");
    }

    public static void main(String[] args) {

        Bank02 bank = new Bank02();

        bank.checkInvalidArgs(args);
        bank.print(args);

        switch (args.length) {
            case 2:
                bank = new Bank02(args[0], args[1]);
                break;
            case 4:
                bank = new Bank02(args[0], args[1], args[2], args[3]);
                bank.checkInvalidOption();  // 옵션(1입금, 2출금) 유효성 체크
                bank.work();  // 옵션 실행
                break;
            default:
                System.out.println("입력 인자 개수가 2, 4가 아닙니다.");
        }
        bank.displayMoney();
    }
}
