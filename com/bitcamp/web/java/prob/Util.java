package com.bitcamp.web.java.prob;

import java.util.Arrays;

public class Util {

    //M
    // 2부터 limit 까지의 소수의 개수를 리턴하는 메서드
    public int findPrimeCnt(int limit) {

        int primeCnt = 0;
        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 소수가 아니면
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

        int[] primeArr = new int[limit];
        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 나누어 떨어지면
                    isPrime = false;    // 소수가 아니다
                    break;
                }
            }
            if (isPrime) {
                primeArr[i-2] = i;
            }
        }//end of for

//        System.out.println(Arrays.toString(primeArr));


        return primeArr;
    }
}
