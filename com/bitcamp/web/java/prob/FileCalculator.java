package com.bitcamp.web.java.prob;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCalculator {

    public void addCalculateResult(String inputFileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(inputFileName));

        int sum = 0;
        int multi = 1;

        List<Integer> list = new ArrayList<>();

        // 1. readLine()
        String str = "";
        while ((str = br.readLine()) != null) {
            list.add(Integer.parseInt(str));
        }//end of while
        br.close();


        // 2. Че, Аі
        for (Integer i : list) {
            sum += i;
            multi *= i;
        }


        // 3. write()
        BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName, true));

        bw.write("\n" + Integer.toString(sum));
        bw.write("\n" + Integer.toString(multi));

//        bw.flush();
        bw.close();
    }

    //Main
    public static void main(String[] args) throws Exception {
        FileCalculator fc = new FileCalculator();
        fc.addCalculateResult("D:\\test.txt");
    }
}
