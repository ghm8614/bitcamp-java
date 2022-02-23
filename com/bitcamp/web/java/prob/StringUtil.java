package com.bitcamp.web.java.prob;

import java.util.Arrays;

public class StringUtil {

    //M
    private static String replaceString(String[] arr) {

        String result = "";

        // a 카운트 배열 생성
        int[] aCnt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a') {
                    aCnt[i]++;
                }
            }
        }//end of for


        // 반복문 -> 최대값에 해당하는 인덱스
        int maxValue = aCnt[0];
        int maxIndex = 0;
        for (int i = 1; i < aCnt.length; i++) {
            if (maxValue < aCnt[i]) {
                maxValue = aCnt[i];
                maxIndex = i;
            }
        }
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
