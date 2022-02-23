package com.bitcamp.web.java.prob;

import java.util.Arrays;

public class StringUtil {

    //M
    private static String replaceString(String[] arr) {

        String result = "";

        // a ī��Ʈ �迭 ����
        int[] aCnt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a') {
                    aCnt[i]++;
                }
            }
        }//end of for


        // �ݺ��� -> �ִ밪�� �ش��ϴ� �ε���
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
        System.out.println("����� ���ڿ� : " + result);
    }
}
