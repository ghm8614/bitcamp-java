package com.bitcamp.web.java.prob;

public class Account2 {

    //F
    private String accountNo;  // ���¹�ȣ
    private boolean creditLine; // ���̳ʽ� ���� ����
    private int creditLineLimit;    // ���̳ʽ� �ݾ� �ѵ�
    private int balance;    // �ܰ�

    //C
    public Account2() {
    }

    public Account2(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
        this.accountNo = accountNo;
        this.creditLine = creditLine;
        this.creditLineLimit = creditLineLimit * (-1);
        this.balance = balance;
    }

    //M
    public void withdraw(int money) throws Exception {

        if (creditLine) {
            balance -= money;
            if (balance < creditLineLimit) {
                throw new Exception("�ܰ���� ��� �Ұ� �մϴ�.");
            }
        } else {
            balance -= money;
            if (balance < money) {
                throw new Exception("�ܰ���� ��� �Ұ� �մϴ�.");
            }
        }

    }

    public void deposit(int money) {
        balance += money;
    }


    //getter/setter
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public boolean isCreditLine() {
        return creditLine;
    }

    public void setCreditLine(boolean creditLine) {
        this.creditLine = creditLine;
    }

    public int getCreditLineLimit() {
        return creditLineLimit;
    }

    public void setCreditLineLimit(int creditLineLimit) {
        this.creditLineLimit = creditLineLimit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // toString �������̵�
    @Override
    public String toString() {
        if (creditLine) {
            return "���¹�ȣ : " + accountNo + ", �ܰ� : " + balance + "��\t[[ " + creditLineLimit + " ���̳ʽ� ���� ]]";
        } else {
            return "���¹�ȣ : " + accountNo + ", �ܰ� : " + balance + "��";
        }
    }
}
