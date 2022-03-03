package com.bitcamp.web.java.prob;

public class Prob26 {

    public static void main(String[] args) {

        // 111-111-111, ���̳ʽ� ����, ���̳ʽ� �����ѵ�, �ܰ� �� ���� ���� �ν��Ͻ� ����
        Account2 account1 = new Account2("111-111-111", true, 1000000, 100000);
        try {
            //���¹�ȣ, �ܰ�, ���̳ʽ� ���� ���� ���
            System.out.println("0. ���� ���� ����");
            System.out.println("[��������]" + account1);

            System.out.println("\n1. " + account1.getAccountNo() + " ���� 200000 ��ݿ�û");
            account1.withdraw(200000);
            System.out.println("[��������]" + account1);

            System.out.println("\n2. " + account1.getAccountNo() + " ���� 100000 �Աݿ�û");
            account1.deposit(100000);
            System.out.println("[��������]" + account1);

            System.out.println("\n3. " + account1.getAccountNo() + " ���� 500000 ��ݿ�û");
            account1.withdraw(500000);
            System.out.println("[��������]" + account1);

            System.out.println("\n4. " + account1.getAccountNo() + " ���� 600000 ��ݿ�û");
            account1.withdraw(600000);
            System.out.println("[��������]" + account1);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("���ܹ߻� : " + account1.getAccountNo() + " : " + e.getMessage());
        }

        System.out.println("==============================================\n");

        // ���� �ν��Ͻ� ����
        Account2 account2 = new Account2();
        try {
            account2.setAccountNo("222-222-222");
            System.out.println("0. ���� ���� ����");
            System.out.println("[��������]" + account2);

            System.out.println("\n1. " + account2.getAccountNo() + " ���� 100000 �Աݿ�û");
            account2.deposit(100000);
            System.out.println("[��������]" + account2);

            System.out.println("\n2. " + account2.getAccountNo() + " ���� 50000 ��ݿ�û");
            account2.withdraw(50000);
            System.out.println("[��������]" + account2);

            System.out.println("\n3. " + account2.getAccountNo() + " ���� 60000 ��ݿ�û");
            account2.withdraw(60000);
            System.out.println("[��������]" + account2);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("���ܹ߻� : " + account2.getAccountNo() + " : " + e.getMessage());
        }
    }
}
