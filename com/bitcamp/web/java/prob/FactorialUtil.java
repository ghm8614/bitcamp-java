package com.bitcamp.web.java.prob;

import java.util.Scanner;

public class FactorialUtil {

    // 0! = 1
    public int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input : ");

        FactorialUtil util = new FactorialUtil();
        System.out.print("Result = " + util.factorial(sc.nextInt()));
    }
}
