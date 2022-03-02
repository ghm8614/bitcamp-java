package com.bitcamp.web.java.prob;

public class SmartPhone extends CellPhone {

    //F
    private boolean isMonthlyFixedRate; // ������ ����
    private int monthlyFixedFee;    // ������ ���

    //C  ???
    public SmartPhone(String phoneNumber, int feePerCallTime) {
        super(phoneNumber, feePerCallTime);
    }

    public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
        super(phoneNumber, feePerCallTime);
        this.isMonthlyFixedRate = isMonthlyFixedRate;
        this.monthlyFixedFee = monthlyFixedFee;
    }

    //M

    // calculationTotalFee() Overriding
    @Override
    public void calculationTotalFee() {
        if (!isMonthlyFixedRate) {
            super.calculationTotalFee();
        } else {
            System.out.printf("������ %d ���� ������Դϴ�. \n", this.monthlyFixedFee);
            super.setTotalFee(this.monthlyFixedFee);
        }
    }

    // getter/setter

    public boolean isMonthlyFixedRate() {
        return isMonthlyFixedRate;
    }

    public void setMonthlyFixedRate(boolean monthlyFixedRate) {
        isMonthlyFixedRate = monthlyFixedRate;
    }

    public int getMonthlyFixedFee() {
        return monthlyFixedFee;
    }

    public void setMonthlyFixedFee(int monthlyFixedFee) {
        this.monthlyFixedFee = monthlyFixedFee;
    }
}
