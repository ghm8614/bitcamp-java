package com.bitcamp.web.java.prob;

public abstract class Shape {

    //Field
    protected double area;
    private String name;

    //Instance Constructor Method
    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    //Method
    // ��������
    public abstract void calculationArea();

    public void print() {
        System.out.println(getName()+"�� ������ "+ getArea());
    }

    //getter/setter
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
