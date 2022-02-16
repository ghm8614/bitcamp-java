package com.bitcamp.web.java.prob;

public class Prob7 {

    //Method
    public int abs(int num1, int num2) {

        if (num1 < num2) {
            return -(num1-num2);
        }
        return num1-num2;
    }

    //Main
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 15;

        Prob7 prob = new Prob7();
        System.out.println("두 수의 차는 " + prob.abs(num1, num2));
    }
}
