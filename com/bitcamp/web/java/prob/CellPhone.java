package com.bitcamp.web.java.prob;

public class CellPhone {

    //F
    private String phoneNumber; // ��ȭ��ȣ
    private int totalCallTime;  // ��ȭ���ð�
    private int totalFee;   // �����
    private int feePerCallTime; // �ð��� �����

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
        System.out.printf("%s ��ȣ�� %d ��ȭ��.\n", callNumber, callTime);
    }

    // calculationTotalFee()
    public void calculationTotalFee() {
        this.totalFee = this.totalCallTime * this.feePerCallTime;
    }

    // toString
//    @Override
//    public String toString() {
//        return this.getPhoneNumber() + " �� ��ȭ�ð��� "
//                + this.getTotalCallTime() + " �̸� \n �ܰ� "
//                + this.getFeePerCallTime() + " �� ����� "
//                + this.getTotalFee() + "�� �Դϴ�.";
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
