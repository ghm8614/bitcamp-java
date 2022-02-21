package com.bitcamp.web.java.prob;

import java.util.Arrays;

// �迭�� �������� ����
// ��������, ��������
public class Prob5 {

    //Method
    private static int[] selectSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {    // �迭�� ������ element ���� �� �ʿ䰡 ����.
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }//end of for
        return array;
    }

//    private static int[] bubbleSort(int[] array) {
//
//        // temp1 : ������, temp2 : ū��
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//
//        }
//        return array;
//    }

    //Main
    public static void main(String[] args) {

        int[] array = {3, 24, 1, 55, 17, 43, 5};
        System.out.println(Arrays.toString(selectSort(array)));
//        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
