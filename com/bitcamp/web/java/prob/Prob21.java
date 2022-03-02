package com.bitcamp.web.java.prob;

public class Prob21 {

    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone("010-010-010", 1000);
        cellPhone.call("017-017-017", 10);
        cellPhone.call("016-016-016", 10);
        cellPhone.calculationTotalFee();

//        cellPhone.toString();  // Result of 'CellPhone.toString()' is ignored ?

        System.out.println(cellPhone.getPhoneNumber() + " 의 통화시간은 "
                + cellPhone.getTotalCallTime() + " 이며 \n 단가 "
                + cellPhone.getFeePerCallTime() + " 총 요금은 "
                + cellPhone.getTotalFee() + "원 입니다.");

        System.out.println("==========================");

        SmartPhone smartPhone1 = new SmartPhone("000-000-000", 200);
        smartPhone1.call("017-017-017", 10);
        smartPhone1.calculationTotalFee();

        System.out.println(smartPhone1.getPhoneNumber() + " 의 통화시간은 "
                + smartPhone1.getTotalCallTime() + " 이며 \n 단가 "
                + smartPhone1.getFeePerCallTime() + " 총 요금은 "
                + smartPhone1.getTotalFee() + "원 입니다.");


        System.out.println("==========================");


        SmartPhone smartPhone2 = new SmartPhone("111-111-111", 0,true,3000);
        smartPhone2.call("017-017-017", 10);
        smartPhone2.call("016-016-016", 10);
        smartPhone2.calculationTotalFee();

        System.out.println(smartPhone2.getPhoneNumber() + " 의 통화시간은 "
                + smartPhone2.getTotalCallTime() + " 이며 \n 단가 "
                + smartPhone2.getFeePerCallTime() + " 총 요금은 "
                + smartPhone2.getTotalFee() + "원 입니다.");




    }//end of main

}//end of class
