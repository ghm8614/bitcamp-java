package com.bitcamp.web.java.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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

    // ��ȯŸ�� int[]
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

    // ��ȯŸ�� List �������̽� (Vector/ArrayList ���� ���氡��)
    public List<Integer> findPrimeReturnArrayList(int limit) {

        List<Integer> primeArrayList = new ArrayList<>(); // �迭ó�� ũ�⸦ �������� �ʾƵ� �ȴ�.

        boolean isPrime;

        for (int i = 2; i <= limit; i++) {
            isPrime = true; //
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // ������ ��������
                    isPrime = false;    // �Ҽ� x
                    break;
                }
            }
            if (isPrime) {
                primeArrayList.add(i);  // �迭ó�� �ݺ����� ���� �ε����� ���� ��, ���� �������� �ʾƵ� �ȴ�.
            }
        }//end of for

        return primeArrayList;
    }
}
