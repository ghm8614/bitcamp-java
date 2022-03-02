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

        System.out.println("�Է� : Korea");
        System.out.println("��� : " + p.toEncoding("Korea"));
        System.out.println("�Է� : ȫ�浿");
        System.out.println("��� : " + p.toEncoding("ȫ�浿"));
        System.out.println("�Է� : ȫ �� ��");
        System.out.println("��� : " + p.toEncoding("ȫ �� ��"));
        System.out.println("�Է� : Hong �� ��");
        System.out.println("��� : " + p.toEncoding("Hong �� ��"));
        System.out.println("�Է� : 0319");
        System.out.println("��� : " + p.toEncoding("0319"));

    }//end of main

}//end of class

