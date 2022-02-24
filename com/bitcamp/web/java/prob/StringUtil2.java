package com.bitcamp.web.java.prob;

public class StringUtil2 {

    // 문자열 배열 입력받아 -> a가 가장 많은 문자열을 a->A 바꾸기
    private static String replaceString(String[] arr) {
//        String[] arr = {"java program", "array", "java program area", "append"};

        int aCnt = 0;
        int maxACnt = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a') {
                    aCnt++;
                }
            }
            if (aCnt > maxACnt) {
                maxACnt = aCnt;
                maxIndex = i;
            }
            aCnt = 0;
        }
//        System.out.println(aCnt);   // 1
//        System.out.println(maxACnt);    // 5
//        System.out.println(maxIndex);   // 2


        return arr[maxIndex].replace('a', 'A');
    }

    //Main
    public static void main(String[] args) {

        String[] arr = {"java program", "array", "java program area", "append"};
        String result = StringUtil2.replaceString(arr);
        System.out.println("변경된 문자열 : " + result);
    }
}
