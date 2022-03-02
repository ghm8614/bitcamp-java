package com.bitcamp.web.java.prob;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob25 {

    // java.lang.String: split()
    private static String getParameter(String url, String paramName) {

        String result = "";

        // &�� �����ڷ� split
        String[] split1 = url.split("&");
        for (String str : split1) {
            if (str.contains(paramName)) {
                result = str;
            }
        }

        // =�� �����ڷ� split
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

        String url1 = "http://localhost/order?prodid=PROD-001&prodName=������3&price=980000";

        String prodName = getParameter2(url1, "prodName");
        System.out.println("��ǰ �̸� : " + prodName);

        String url2 = "http://localhost/userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
        String userAddress = getParameter2(url2, "address");
        System.out.println("ȸ�� �ּ� : " + userAddress);
    }
}
