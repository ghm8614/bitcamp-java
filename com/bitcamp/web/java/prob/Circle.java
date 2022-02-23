package com.bitcamp.web.java.prob;

public class Circle extends Shape {

    //Field
    private double radius;

    //Instance Constructor Method
    public Circle() {
    }

    public Circle(String name, double radius) {
        super(name);    // ��� �ÿ��� ��밡��..
        this.radius = radius;
    }

    //Method
    // ��������
    @Override
    public void calculationArea() {

        // ��� ���� (getter �޼��� �Ǵ� �ʵ�)
//        super.setArea(radius * radius * Math.PI);
//        this.setArea(radius * radius * Math.PI);
//        setArea(radius * radius * Math.PI);

//        super.area = radius * radius * Math.PI;
//        this.area = radius * radius * Math.PI;
        area = radius * radius * Math.PI;

    }

    //getter/setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

