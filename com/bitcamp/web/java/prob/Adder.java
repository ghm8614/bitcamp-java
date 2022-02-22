package com.bitcamp.web.java.prob;

public class Adder {

    //Method
    public int execute(String expr) {
//        String expr = "3+5+9+1";

        int result = 0;
        String strNum = "";

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '+') {
                result += Integer.parseInt(strNum);
                strNum = "";  // ���� ���ڿ��� ���� �������� �ʰ�, strNum ����
            } else {
                strNum += c;
            }
        }//end of for

        return (result + Integer.parseInt(strNum));  // ���ϱⰡ ���� �� ������ ���ڸ� ������� �Ѵ�
    }

    public int execute2(String expr) {
//        String expr = "3+5+9+1";

        int result = 0;

        String[] strArr = expr.split("\\+");

        for (int i = 0; i < strArr.length; i++) {
            result += Integer.parseInt(strArr[i]);
        }//end of for
        return result;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        String expr = "3+5+9+1";
        System.out.println(expr + "=" + adder.execute2(expr));
        expr = "11+45+77+3";
        System.out.println(expr + "=" + adder.execute2(expr));
        expr = "33+51+12+11";
        System.out.println(expr + "=" + adder.execute2(expr));
    }
}
