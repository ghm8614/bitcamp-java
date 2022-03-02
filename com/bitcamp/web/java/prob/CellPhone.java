package com.bitcamp.web.java.prob;

public class CellPhone {

    //F
    private String phoneNumber; // 전화번호
    private int totalCallTime;  // 전화사용시간
    private int totalFee;   // 사용요금
    private int feePerCallTime; // 시간당 사용요금

    //C
    public CellPhone() {

    }

    public CellPhone(String phoneNumber, int feePerCallTime) {
        this.phoneNumber = phoneNumber;
        this.feePerCallTime = feePerCallTime;
    }

    //M
    // call()
    public void call(String callNumber, int callTime) {
        this.totalCallTime += callTime;
        System.out.printf("%s 번호로 %d 통화함.\n", callNumber, callTime);
    }

    // calculationTotalFee()
    public void calculationTotalFee() {
        this.totalFee = this.totalCallTime * this.feePerCallTime;
    }

    // toString
//    @Override
//    public String toString() {
//        return this.getPhoneNumber() + " 의 통화시간은 "
//                + this.getTotalCallTime() + " 이며 \n 단가 "
//                + this.getFeePerCallTime() + " 총 요금은 "
//                + this.getTotalFee() + "원 입니다.";
//    }


    // getter/setter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalCallTime() {
        return totalCallTime;
    }

    public void setTotalCallTime(int totalCallTime) {
        this.totalCallTime = totalCallTime;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getFeePerCallTime() {
        return feePerCallTime;
    }

    public void setFeePerCallTime(int feePerCallTime) {
        this.feePerCallTime = feePerCallTime;
    }
}
