package com.bitcamp.web.java.prob;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FileController {

    // java.util.List
    public void reverseLine1(String inputFileName, String outputFileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));

        List<String> list = new ArrayList<>();

        // read()
        while (true) {

            String str = br.readLine();
            if (str == null) {
                break;
            }
            list.add(str);
        }
        br.close();

        // write()
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
            bw.newLine();
        }
//        bw.flush();

        bw.close();
    }

    // java.util.Stack
    public void reverseLine2(String inputFileName, String outputFileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));

        Stack<String> stack = new Stack<>();

        // read()
        while (true) {

            String str = br.readLine();
            if (str == null) {
                break;
            }
            stack.push(str);
        }
        br.close();

        // write()
        while (!stack.isEmpty()) {
            bw.write(stack.pop());
            bw.newLine();
        }
//        bw.flush();

        bw.close();
    }

    //Main
    public static void main(String[] args) throws Exception {
        FileController c = new FileController();
        String oldf = "files/oldf.txt";
        String newf = "files/newf.txt";
        c.reverseLine2(oldf, newf);
    }//end of main

}//end of class
