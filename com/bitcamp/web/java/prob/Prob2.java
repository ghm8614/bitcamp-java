package com.bitcamp.web.java.prob;

public class Prob2 {

    public static void main(String[] args) {

        int limit = 50;
        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {   // 나누어 떨어지면
                    isPrime = false;    // 소수 x
                    break; // 한번이라도 성립하면 for 문 종료
                }
            }
            // isPrime=true, 즉 소수인 것만 출력
            if (isPrime) {
                System.out.println(i); //소수를 따로 배열에 저장하지 않고, 찾을 때 마다 출력
            }
        }

    }
}