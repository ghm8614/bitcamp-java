package com.bitcamp.web.java.prob;

public class Prob18 {

    public static void main(String[] args) {
        int limit = 67;

        Util util = new Util();

        int primeCnt = util.findPrimeCnt(limit);
        System.out.println("1~" + limit + "������ �Ҽ��� ������ " + primeCnt + "EA�̸� �Ҽ��� �Ʒ��� ����.");
        System.out.println("===================================================");

        // ��ȯŸ�� Array
        int[] primeArray = util.findPrimeReturnArray(limit);
        for (int i = 0; i < primeArray.length; i++) {
            System.out.print(primeArray[i] + ((primeArray.length - 1) != i ? "," : ""));
        }
        System.out.println("\n================================================");

        // ��ȯŸ�� List
        System.out.println(util.findPrimeReturnArrayList(limit));
    }
}
