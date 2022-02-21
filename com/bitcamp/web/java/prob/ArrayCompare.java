package com.bitcamp.web.java.prob;

public class ArrayCompare {

    //Method
    private static void print(int[] arr1, int[] arr2) {
        if (equalsArr(arr1, arr2)) {
            System.out.println("두 배열을 동일합니다.");
        } else {
            System.out.println("두 배열은 동일하지 않습니다.");
        }
        System.out.println("====================");
    }

    // 1. 두 배열의 길이가 다르면 무조건 false
    // 2. 두 배열을 index 0부터 .length 까지 비교할 때, 하나라도 다르면 false
    private static boolean equalsArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //Main
    public static void main(String[] args) {

        int[] arr1 = {3, 5, 6, 9, 10, 2, 7};
        int[] arr2 = {3, 5, 6, 9, 10, 2, 7};

        int[] arr3 = {3, 5, 6, 9};
        int[] arr4 = {3, 5, 6, 9, 8};

        print(arr1, arr2);
        print(arr3, arr4);
    }
}
