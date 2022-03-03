package com.bitcamp.web.java.prob;

public class Prob26 {

    public static void main(String[] args) {

        // 111-111-111, 마이너스 통장, 마이너스 통장한도, 잔고 를 갖는 계좌 인스턴스 생성
        Account2 account1 = new Account2("111-111-111", true, 1000000, 100000);
        try {
            //계좌번호, 잔고, 마이너스 통장 유무 출력
            System.out.println("0. 최초 계좌 상태");
            System.out.println("[계좌정보]" + account1);

            System.out.println("\n1. " + account1.getAccountNo() + " 계좌 200000 출금요청");
            account1.withdraw(200000);
            System.out.println("[계좌정보]" + account1);

            System.out.println("\n2. " + account1.getAccountNo() + " 계좌 100000 입금요청");
            account1.deposit(100000);
            System.out.println("[계좌정보]" + account1);

            System.out.println("\n3. " + account1.getAccountNo() + " 계좌 500000 출금요청");
            account1.withdraw(500000);
            System.out.println("[계좌정보]" + account1);

            System.out.println("\n4. " + account1.getAccountNo() + " 계좌 600000 출금요청");
            account1.withdraw(600000);
            System.out.println("[계좌정보]" + account1);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("예외발생 : " + account1.getAccountNo() + " : " + e.getMessage());
        }

        System.out.println("==============================================\n");

        // 계좌 인스턴스 생성
        Account2 account2 = new Account2();
        try {
            account2.setAccountNo("222-222-222");
            System.out.println("0. 최초 계좌 상태");
            System.out.println("[계좌정보]" + account2);

            System.out.println("\n1. " + account2.getAccountNo() + " 계좌 100000 입금요청");
            account2.deposit(100000);
            System.out.println("[계좌정보]" + account2);

            System.out.println("\n2. " + account2.getAccountNo() + " 계좌 50000 출금요청");
            account2.withdraw(50000);
            System.out.println("[계좌정보]" + account2);

            System.out.println("\n3. " + account2.getAccountNo() + " 계좌 60000 출금요청");
            account2.withdraw(60000);
            System.out.println("[계좌정보]" + account2);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("예외발생 : " + account2.getAccountNo() + " : " + e.getMessage());
        }
    }
}
