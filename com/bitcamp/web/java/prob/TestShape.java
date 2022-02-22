package com.bitcamp.web.java.prob;

public class TestShape {

    //Main
    public static void main(String[] args) {

        Shape[] shape = new Shape[2];

        shape[0] = new Circle("원", 10);
        shape[1] = new Rectangular("직사각형", 10, 20);

        for (int i = 0; i < shape.length; i++) {
            shape[i].calculationArea(); // 출력 x
            shape[i].print();   // 출력 o
        }
    }
}
