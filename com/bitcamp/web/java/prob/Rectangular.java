package com.bitcamp.web.java.prob;

public class Rectangular extends Shape {

    //Field
    private double width;
    private double height;

    //Instance Constructor Method
    public Rectangular() {
    }

    public Rectangular(String name, double width, double height) {
        super(name);    // 상속 시에만 가능..
        this.width = width;
        this.height = height;
    }

    //Method
    // 구현강제
    @Override
    public void calculationArea() {
        super.setArea(width * height);
    }

    //getter/setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
