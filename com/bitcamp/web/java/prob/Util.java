package com.bitcamp.web.java.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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

    // 반환타입 int[]
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

    // 반환타입 List 인터페이스 (Vector/ArrayList 쉽게 변경가능)
    public List<Integer> findPrimeReturnArrayList(int limit) {

        List<Integer> primeArrayList = new ArrayList<>(); // 배열처럼 크기를 지정하지 않아도 된다.

        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 나누어 떨어지면
                    isPrime = false;    // 소수 x
                    break;
                }
            }
            if (isPrime) {
                primeArrayList.add(i);  // 배열처럼 반복문을 통해 인덱스에 접근 후, 값을 대입하지 않아도 된다.
            }
        }//end of for

        return primeArrayList;
    }
}
