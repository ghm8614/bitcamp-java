package com.bitcamp.web.java.prob;

public class CellPhone2Main {

    public static void main(String[] args) {

        CellPhone2 myPhone = new CellPhone2("SCH-600");

        myPhone.charge(20);
        myPhone.printBattery();

        myPhone.call(300);
        myPhone.printBattery();

        myPhone.charge(50);
        myPhone.printBattery();

        myPhone.call(40);
        myPhone.printBattery();

        try {
            myPhone.call(-20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

        CellPhone2 yourPhone = new CellPhone2("SCH-600");

        if (myPhone.equals(yourPhone)) {
            System.out.println("동일한 모델입니다.");
        } else {
            System.out.println("다른 모델입니다.");
        }

    }//end of main

}//end of class
