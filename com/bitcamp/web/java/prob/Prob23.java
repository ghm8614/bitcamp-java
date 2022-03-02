package com.bitcamp.web.java.prob;

import java.util.List;
import java.util.Vector;

public class Prob23 {

    //M
    public Vector<String> dataChange(String[] strData) {

        int size = strData.length;
        Vector<String> vector = new Vector<>();

        StringBuffer sb = new StringBuffer();

        for (int i = size - 1; i >= 0; i--) {
            sb.delete(0, sb.length());
            for (int j = strData[i].length() - 1; j >= 0; j--) {
                sb.append(strData[i].charAt(j));
            }
            vector.add(sb.toString());
        }
        return vector;
    }

    public List<String> dataChange2(String[] strData) {

        int size = strData.length;
        List<String> list = new Vector<>();

        StringBuffer sb = new StringBuffer();

        for (int i = size - 1; i >= 0; i--) {
            sb.delete(0, sb.length());
            for (int j = strData[i].length() - 1; j >= 0; j--) {
                sb.append(strData[i].charAt(j));
            }
            list.add(sb.toString());
        }
        return list;
    }

    public List<String> dataChange3(String[] strData) {

        int size = strData.length;
        List<String> list = new Vector<>();

        StringBuffer sb = new StringBuffer();

        for (int i = size - 1; i >= 0; i--) {
            sb.append(strData[i]).reverse();
            list.add(sb.toString());
            sb.delete(0, sb.length());
        }

        return list;
    }

    //Main
    public static void main(String[] args) {

        Prob23 st = new Prob23();
        String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
//        Vector<String> vector = st.dataChange(strData);
//        List<String> list = st.dataChange2(strData);
        List<String> list = st.dataChange3(strData);
//
//
//        for (int i = 0; i < vector.size(); i++) {
//            System.out.println(vector.elementAt(i));
//        }
//
        // 향상된 for문
        for (String result : list) {
            System.out.println(result);
        }
//
//        System.out.println(vector);
//        System.out.println(list);
//
//        System.out.println(vector.toString());
//        System.out.println(list.toString());

    }
}
