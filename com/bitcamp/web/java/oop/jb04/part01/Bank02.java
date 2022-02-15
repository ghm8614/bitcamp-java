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

    // command, money�� String���� �Է¹޾� int�� �ٲٴ� ���� ����غ���
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

    // �����丵 (������ �κ�)
    // �����ϴ� main���� ���ǹ� ������� ����,
    // �ڹٺ󿡼� �޼���� ���� ��, main������ ȣ�⸸
    // ��ü������ �ڵ� �ۼ��ϱ�

    // ��� ���� �޼���
    public void work() {
        if (command == 1) {
            deposit();
        } else if (command == 2) {
            withdraw();
        }
    }
    public void displayMoney() {
        System.out.println("���� �ܾ� : " + balance + "�Դϴ�.");
    }
    // �μ� ��ȿ�� üũ
    public void checkInvalidArgs(String[] args) {
        if (!(args.length == 2 || args.length == 4)) {
            System.out.println("[usage]: java Bank [customerName][bankName][option][money]");
            System.out.println("[usage]: ���ڰ��� 2, 4���� �ʿ��մϴ�.");
            System.exit(0);
        }
    }
    // �ɼ�(�Ա�, ���) ��ȿ�� üũ
    public void checkInvalidOption() {
        if (!(command == 1 || command == 2)) {
            System.out.println("[usage]: java Bank [customerName][bankName][option][money]");
            System.out.println("[usage]: Option �� �ݵ�� ���� 1(�Ա�), 2(���) �� �ϳ��Դϴ�.");
            System.exit(0);
        }
    }
    public void print(String[] args) {
        String userName = args[0];
        String bankName = args[1];
        System.out.println(userName + "���� �ְŷ� ������ " + bankName + "�Դϴ�.");
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
                bank.checkInvalidOption();  // �ɼ�(1�Ա�, 2���) ��ȿ�� üũ
                bank.work();  // �ɼ� ����
                break;
            default:
                System.out.println("�Է� ���� ������ 2, 4�� �ƴմϴ�.");
        }
        bank.displayMoney();
    }
}
