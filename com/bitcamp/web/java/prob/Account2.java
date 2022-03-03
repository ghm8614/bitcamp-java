package com.bitcamp.web.java.prob;

public class Account2 {

    //F
    private String accountNo;  // 계좌번호
    private boolean creditLine; // 마이너스 통장 유무
    private int creditLineLimit;    // 마이너스 금액 한도
    private int balance;    // 잔고

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
                throw new Exception("잔고부족 출금 불가 합니다.");
            }
        } else {
            balance -= money;
            if (balance < money) {
                throw new Exception("잔고부족 출금 불가 합니다.");
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

    // toString 오버라이딩
    @Override
    public String toString() {
        if (creditLine) {
            return "계좌번호 : " + accountNo + ", 잔고 : " + balance + "원\t[[ " + creditLineLimit + " 마이너스 통장 ]]";
        } else {
            return "계좌번호 : " + accountNo + ", 잔고 : " + balance + "원";
        }
    }
}
