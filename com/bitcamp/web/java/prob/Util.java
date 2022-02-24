package com.bitcamp.web.java.prob;

import java.util.Arrays;

public class Util {

    // 2부터 limit 까지의 소수의 개수를 리턴하는 메서드
    public int findPrimeCnt(int limit) {

        int primeCnt = 0;
        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCnt++;
            }
        }
        return primeCnt;
    }

    // 2부터 limit 까지의 소수를 배열에 저장하고 리턴하는 메서드
    public int[] findPrimeReturnArray(int limit) {

        int primeCnt = findPrimeCnt(limit); // 위 메서드 호출
        int[] primeArr = new int[primeCnt]; // 현재 메서드에서 사용

        boolean isPrime;
        int temp = 0;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 나누어 떨어지면
                    isPrime = false;    // 소수 x
                    break;
                }
            }
            if (isPrime) {
                primeArr[temp] = i;
                temp++;
            }
        }//end of for

//        System.out.println(Arrays.toString(primeArr));
        return primeArr;
    }
}
