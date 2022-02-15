package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 임의의 정수 입력 받기
// 1 ~ 1000 까지의 수 중, 입력받은 정수의 배수 개수와 배수 합 구하기
public class Prob4 {
    public static void main(String[] args) {

        int number = 0;
        int count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        number = sc.nextInt();

        // 배수의 개수 : 1000/입력한 정수
        count = 1000 / number;

        // 배수의 합 : 입력한 정수 * 반복범위(1~배수의개수)
        for (int i = 1; i <= count; i++) {
            sum += number * i;
        }

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
    }
}
