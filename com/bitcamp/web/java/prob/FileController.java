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
        String oneLine;

        while ((oneLine = br.readLine()) != null) {
            list.add(oneLine);
        }
        br.close();

        // write()
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    // java.util.Stack
    public void reverseLine2(String inputFileName, String outputFileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));

        Stack<String> stack = new Stack<>();

        // read()
        String oneLine;

        while ((oneLine = br.readLine()) != null) {
            stack.push(oneLine);
        }
        br.close();

        // write()
        while (!stack.isEmpty()) {
            bw.write(stack.pop());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    //Main
    public static void main(String[] args) throws Exception {
        FileController c = new FileController();
        String oldf = "files/oldf.txt";
        String newf = "files/newf.txt";
        c.reverseLine1(oldf, newf);
    }//end of main

}//end of class
