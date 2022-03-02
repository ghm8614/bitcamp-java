package com.bitcamp.web.java.prob;

public class Prob18 {

    public static void main(String[] args) {
        int limit = 67;

        Util util = new Util();

        int primeCnt = util.findPrimeCnt(limit);
        System.out.println("1~" + limit + "까지의 소수의 개수는 " + primeCnt + "EA이며 소수는 아래와 같다.");
        System.out.println("===================================================");

        // 반환타입 Array
        int[] primeArray = util.findPrimeReturnArray(limit);
        for (int i = 0; i < primeArray.length; i++) {
            System.out.print(primeArray[i] + ((primeArray.length - 1) != i ? "," : ""));
        }
        System.out.println("\n================================================");

        // 반환타입 List
        System.out.println(util.findPrimeReturnArrayList(limit));
    }
}
