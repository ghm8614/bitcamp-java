package com.bitcamp.web.java.prob;

import java.util.Arrays;

// 배열을 오름차순 정렬
// for문 사용
public class Prob5 {
    public static void main(String[] args) {

        int[] array = {3, 24, 1, 55, 17, 43, 5};
        int size = array.length;

        for (int i = 0; i < size; i++) {
            int min = array[i];
            for (int j = i + 1; j < size; j++) {
                if (min > array[j]) {
                    int temp = min;
                    min = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(min);   // 바깥 for문에서 출력
        }
    }
}
