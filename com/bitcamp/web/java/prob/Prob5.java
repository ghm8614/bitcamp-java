package com.bitcamp.web.java.prob;

import java.util.Arrays;

// 배열을 오름차순 정렬
// for문 사용
public class Prob5 {
    public static void main(String[] args) {

        int[] array = {3, 24, 1, 55, 17, 43, 5};
        int size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }//end of for
        }//end of for

        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }

    }
}
