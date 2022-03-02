package com.bitcamp.web.java.prob;

import java.nio.charset.Charset;

public class Prob24 {

    //M
    public String toEncoding(String str) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c >= '0' && c <= '9' || c >= 'A' && c <= 'z' || c == ' ') {
                sb.append(c);
            } else {
                String temp = c + "";
                byte[] b = temp.getBytes(Charset.forName("euc-kr"));
                for (int j = 0; j < b.length; j++) {
                    sb.append(Integer.toHexString(b[j]).replace("ffffff", "%").toUpperCase());
                }
            }

        }

        return sb.toString();
    }

    //Main
    public static void main(String[] args) {

        Prob24 p = new Prob24();

        System.out.println("입력 : Korea");
        System.out.println("출력 : " + p.toEncoding("Korea"));
        System.out.println("입력 : 홍길동");
        System.out.println("출력 : " + p.toEncoding("홍길동"));
        System.out.println("입력 : 홍 길 동");
        System.out.println("출력 : " + p.toEncoding("홍 길 동"));
        System.out.println("입력 : Hong 길 동");
        System.out.println("출력 : " + p.toEncoding("Hong 길 동"));
        System.out.println("입력 : 0319");
        System.out.println("출력 : " + p.toEncoding("0319"));

    }//end of main

}//end of class

