package com.bitcamp.web.java.prob;

public class Prob18 {

    public static void main(String[] args) {
        int limit = 67;

        Util util = new Util();

        int primeCnt = util.findPrimeCnt(limit);
        System.out.println("1~" + limit + "������ �Ҽ��� ������ " + primeCnt + "EA�̸� �Ҽ��� �Ʒ��� ����.");
        System.out.println("==========================");

        int[] primeArray = util.findPrimeReturnArray(limit);

        for (int i = 0; i < primeArray.length; i++) {
            System.out.println(primeArray[i] + ((primeArray.length - 1) != i ? "," : ""));
        }
    }
}
