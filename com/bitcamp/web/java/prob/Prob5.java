package com.bitcamp.web.java.prob;

import java.util.Arrays;

// �迭�� �������� ����
// ��������
public class Prob5 {

    //Method
    private static int[] selectSort(int[] array) {

        for (int i = 0; i < array.length; i++) {    // array.length-1 �ƴϴ�. ����
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

    //Main
    public static void main(String[] args) {

        int[] array = {3, 24, 1, 55, 17, 43, 5};
        System.out.println(Arrays.toString(selectSort(array)));
    }
}
