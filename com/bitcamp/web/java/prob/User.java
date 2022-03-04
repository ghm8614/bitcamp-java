package com.bitcamp.web.java.prob;

public class User {

    //F
    private String name;
    private String address;
    private String cellularNumber;
    private boolean male;

    //C
    public User() {

    }

    public User(String name, String address, String cellularNumber, boolean male) {
        this.name = name;
        this.address = address;
        this.cellularNumber = cellularNumber;
        this.male = male;
    }

    //M
    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellularNumber() {
        return cellularNumber;
    }

    public void setCellularNumber(String cellularNumber) {
        this.cellularNumber = cellularNumber;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    // toString �������̵�
    @Override
    public String toString() {
        return ":: �̸� :" + name + ", �ڵ��� : " + cellularNumber + ", ���� : " + (male ? "��" : "��") +
                ", �ּ� : " + address;
    }
}
