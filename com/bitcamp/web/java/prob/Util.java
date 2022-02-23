package com.bitcamp.web.java.prob;

import java.util.Arrays;

public class Util {

    //M
    // 2���� limit ������ �Ҽ��� ������ �����ϴ� �޼���
    public int findPrimeCnt(int limit) {

        int primeCnt = 0;
        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // �Ҽ��� �ƴϸ�
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

        int[] primeArr = new int[limit];
        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // ������ ��������
                    isPrime = false;    // �Ҽ��� �ƴϴ�
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
