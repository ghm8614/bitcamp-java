package com.bitcamp.web.java.prob;

public class Prob2 {

    public static void main(String[] args) {

        int limit = 50;
        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(i); //소수를 따로 배열에 저장하지 않고, 찾을 때 마다 출력
            }
        }

    }
}