package com.bitcamp.web.java.prob;

import java.io.*;
import java.util.ArrayList;

public class FileCompareUtil {

    // �� ������ �����θ� �Է¹޾�
    // �� ������ ������ ���κ��� ��
    // �ٸ� ��쿡 ArrayList�� ��Ƽ� ����

    public ArrayList<String> compareFile(String firstFileName, String scdFileName) throws Exception {

        BufferedReader br1 = new BufferedReader(new FileReader(firstFileName));
        BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));

        ArrayList<String> list = new ArrayList<>();

        int line = 0;

        while (true) {
            String str1 = br1.readLine();
            String str2 = br2.readLine();

            if (str1 == null) {
                br1.close();
                br2.close();
                break;
            }

            line++;

            if (!str1.equals(str2)) {
                list.add("Line " + line + ": " + str2);
            }
        }//end of while

        return list;
    }

    //Main
    public static void main(String[] args) throws Exception {

        FileCompareUtil util = new FileCompareUtil();
        System.out.println(util.compareFile("./files/fstFile1.txt", "./files/scdFile1.txt"));
        System.out.println("Successful !!!");
    }//end of main

}//end of class
