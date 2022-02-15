package com.bitcamp.web.java.oop;

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

    // command�� String type���� �ٲٴ� ���� ����غ���
//    public Bank02(String userName, String bankName, String command) {
//        this.userName = userName;
//        this.bankName = bankName;
//        this.command = Integer.parseInt(command);
//    }

    // money, command�� String type���� �ٲٴ� ���� ����غ���
    public Bank02(String userName, String bankName, String command, String money) {
        this.userName = userName;
        this.bankName = bankName;
        this.command = Integer.parseInt(command);
        this.money = Integer.parseInt(money);
    }

    public void deposit() {
        balance += money;
        System.out.println(money + "�� �Ա�");
    }

    public void withdraw() {
        balance -= money;
        System.out.println(money + "�� ���");
    }

    public void displayMoney() {
        System.out.println("���� �ܾ� : " + balance + "�Դϴ�.");
    }

    public static void main(String[] args) {
        // ��ȿ�� üũ
        if (args.length < 2) {
            System.out.println("[usage]: java Bank [customerName][bankName][option][money]");
            System.out.println("[usage]: ���ڰ��� �ּ� 2���� �ʿ��մϴ�.");
            System.exit(0);
        }

        System.out.println(args[0] + "���� �ְŷ� ������ " + args[1] + "�Դϴ�.");
        Bank02 bank = new Bank02();

        switch (args.length) {
            case 2:
                bank = new Bank02(args[0], args[1]);
                break;
            case 4:
                bank = new Bank02(args[0], args[1], args[2], args[3]);
                if (bank.command == 1) {
                    bank.deposit();
                    break;
                } else if (bank.command == 2) {
                    bank.withdraw();
                    break;
                }
            default:
                System.out.println("�Է� ���� ������ 2, 4�� �ƴմϴ�.");
                // break ���� ����?
        }
        bank.displayMoney();
    }
}
