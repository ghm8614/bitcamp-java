package com.bitcamp.web.java.prob;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob25 {

    // java.lang.String: split()
    private static String getParameter(String url, String paramName) {

        String result = "";

        // &를 구분자로 split
        String[] split1 = url.split("&");
        for (String str : split1) {
            if (str.contains(paramName)) {
                result = str;
            }
        }

        // =를 구분자로 split
        String[] split2 = result.split("=");
        for (String str : split2) {
            if (!str.equals(paramName)) {
                result = str;
            }
        }

        return result;
    }

    // java.util.StringTokenizer
    private static String getParameter2(String url, String paramName) {

        String result = "";
        StringTokenizer st = new StringTokenizer(url,"&=");

        while (st.hasMoreTokens()) {
            if (st.nextToken().contains(paramName)) {
                result = st.nextToken();
            }
        }//end of while

        return result;
    }

    //Main
    public static void main(String[] args) {

        String url1 = "http://localhost/order?prodid=PROD-001&prodName=갤럭시3&price=980000";

        String prodName = getParameter2(url1, "prodName");
        System.out.println("제품 이름 : " + prodName);

        String url2 = "http://localhost/userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
        String userAddress = getParameter2(url2, "address");
        System.out.println("회원 주소 : " + userAddress);
    }
}
