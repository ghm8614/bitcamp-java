package com.bitcamp.web.java.prob;

import java.util.Arrays;

public class StringUtil {

    //M
    // 이중포문?
    private static String replaceString(String[] arr) {

        String result = "";

        int[] aCnt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a') {
                    aCnt[i]++;
                }

            }
        }//end of for

        System.out.println(Arrays.toString(arr));   // [java program, array, java program area, append]
        System.out.println(Arrays.toString(aCnt));  // [3, 2, 5, 1]


        // 반복문-> 최대값 구하기
        int max = aCnt[0];
        int maxIndex = 0;
        for (int i = 1; i < aCnt.length; i++) {
            if (max < aCnt[i]) {
                max = aCnt[i];
                maxIndex = i;
            }
        }
//        System.out.println(max);
//        System.out.println(maxIndex);

        result = arr[maxIndex].replace('a', 'A');


        return result;
    }

    //Main
    public static void main(String[] args) {

        String[] arr = {"java program", "array", "java program area", "append"};
        String result = StringUtil.replaceString(arr);
        System.out.println("변경된 문자열 : " + result);
    }
}
