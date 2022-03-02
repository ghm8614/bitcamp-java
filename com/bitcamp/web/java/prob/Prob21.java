package com.bitcamp.web.java.prob;

public class Prob21 {

    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone("010-010-010", 1000);
        cellPhone.call("017-017-017", 10);
        cellPhone.call("016-016-016", 10);
        cellPhone.calculationTotalFee();

//        cellPhone.toString();  // Result of 'CellPhone.toString()' is ignored ?

        System.out.println(cellPhone.getPhoneNumber() + " �� ��ȭ�ð��� "
                + cellPhone.getTotalCallTime() + " �̸� \n �ܰ� "
                + cellPhone.getFeePerCallTime() + " �� ����� "
                + cellPhone.getTotalFee() + "�� �Դϴ�.");

        System.out.println("==========================");

        SmartPhone smartPhone1 = new SmartPhone("000-000-000", 200);
        smartPhone1.call("017-017-017", 10);
        smartPhone1.calculationTotalFee();

        System.out.println(smartPhone1.getPhoneNumber() + " �� ��ȭ�ð��� "
                + smartPhone1.getTotalCallTime() + " �̸� \n �ܰ� "
                + smartPhone1.getFeePerCallTime() + " �� ����� "
                + smartPhone1.getTotalFee() + "�� �Դϴ�.");


        System.out.println("==========================");


        SmartPhone smartPhone2 = new SmartPhone("111-111-111", 0,true,3000);
        smartPhone2.call("017-017-017", 10);
        smartPhone2.call("016-016-016", 10);
        smartPhone2.calculationTotalFee();

        System.out.println(smartPhone2.getPhoneNumber() + " �� ��ȭ�ð��� "
                + smartPhone2.getTotalCallTime() + " �̸� \n �ܰ� "
                + smartPhone2.getFeePerCallTime() + " �� ����� "
                + smartPhone2.getTotalFee() + "�� �Դϴ�.");




    }//end of main

}//end of class
