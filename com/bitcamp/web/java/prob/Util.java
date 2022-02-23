package com.bitcamp.web.java.prob;

public class Util {

    //M
    // 전달받은 매개변수 까지의 소수의 개수를 리턴하는 메서드
    public int findPrimeCnt(int limit) {

        int primeCnt = 0;
        boolean isPrime = false;
        for (int i = 2; i <= limit; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeCnt++;
            }
        }
        return primeCnt;
    }

    //
    public int[] findPrimeReturnArray(int limit) {

        return null;
    }
}
