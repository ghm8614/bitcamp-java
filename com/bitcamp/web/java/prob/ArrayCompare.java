package com.bitcamp.web.java.prob;

public class ArrayCompare {

    //Method
    private static void print(int[] arr1, int[] arr2) {
        if (equalsArr(arr1, arr2)) {
            System.out.println("�� �迭�� �����մϴ�.");
        } else {
            System.out.println("�� �迭�� �������� �ʽ��ϴ�.");
        }
        System.out.println("====================");
    }

    // 1. �� �迭�� ���̰� �ٸ��� ������ false
    // 2. �� �迭�� index 0���� .length ���� ���� ��, �ϳ��� �ٸ��� false
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
