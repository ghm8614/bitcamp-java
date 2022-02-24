package com.bitcamp.web.java.prob;

import java.util.Arrays;

public class Util {

    // 2���� limit ������ �Ҽ��� ������ �����ϴ� �޼���
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

    // 2���� limit ������ �Ҽ��� �迭�� �����ϰ� �����ϴ� �޼���
    public int[] findPrimeReturnArray(int limit) {

        int primeCnt = findPrimeCnt(limit); // �� �޼��� ȣ��
        int[] primeArr = new int[primeCnt]; // ���� �޼��忡�� ���

        boolean isPrime;
        int temp = 0;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // ������ ��������
                    isPrime = false;    // �Ҽ� x
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
