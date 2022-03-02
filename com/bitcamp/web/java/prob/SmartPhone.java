package com.bitcamp.web.java.prob;

public class SmartPhone extends CellPhone {

    //F
    private boolean isMonthlyFixedRate; // 월정액 유무
    private int monthlyFixedFee;    // 월정액 요금

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
            System.out.printf("고객님은 %d 정액 요금제입니다. \n", this.monthlyFixedFee);
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
