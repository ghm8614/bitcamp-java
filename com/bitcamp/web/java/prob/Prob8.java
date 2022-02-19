package com.bitcamp.web.java.prob;

public class Prob8 {

    //Method
    public int abs(int num1, int num2) {
        int subtraction = num1 - num2;
        if (subtraction < 0) {
            return subtraction * (-1);
        }
        return subtraction;
    }

    //Main
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 15;

        Prob8 prob = new Prob8();
        System.out.println("두 수의 차는 " + prob.abs(num1, num2));
    }
}
