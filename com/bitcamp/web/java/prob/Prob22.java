package com.bitcamp.web.java.prob;

import java.util.*;

public class Prob22 {

    //M
    private static String[] stringSplit(String str, String csv) {

        int csvCnt = 0;
        int strArrIndex = 0;
        StringBuffer sb = new StringBuffer();

        String[] strArr = new String[csvCnt + 1];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == csv.charAt(0)) {
                csvCnt++;
                strArr[strArrIndex++] = sb.toString();
                sb.delete(0, sb.length());
            } else {
                sb.append(str.charAt(i));
            }
            if (i == str.length() - 1) {
                strArr[strArrIndex++] = sb.toString();
            }
        }//end of for

        return strArr;
    }

    private static List<String> stringSplitList(String str, String csv) {

        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == csv.charAt(0)) {
                list.add(sb.toString());
                sb.delete(0, sb.length());
            } else {
                sb.append(str.charAt(i));
            }
            if (i == str.length() - 1) {
                list.add(sb.toString());
            }
        }
        return list;
    }

    private static List<String> stringTokenizer(String str, String csv) {

        StringTokenizer st = new StringTokenizer(str, csv);
        List<String> list = new Vector<>();

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        return list;
    }

    //Main
    public static void main(String[] args) {
        String str = "PROD-001#K-note#Samsung#3#6000000";

        // String[] + StringBuffer
        System.out.println("============== String[] ==============");
        String[] strArr = stringSplit(str, "#");
        System.out.println(Arrays.toString(strArr));

        // List + StringBuffer
        System.out.println("============== ArrayList ==============");
        System.out.println(stringSplitList(str, "#"));

        // stringTokenizer
        System.out.println("============== stringTokenizer ==============");
        System.out.println(stringTokenizer(str, "#"));

    }//end of main

}//end of class
