package com.bitcamp.web.java.prob;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Grade {

    //M
    public void printGrade(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        PrintWriter pw = new PrintWriter(System.out, true);

        String name = "";
        int score = 0;
        int total = 0;
        int lineCnt = 0;

        String str = "";
        while ((str = br.readLine()) != null) {
            name = str.split(",")[0];
            score = Integer.parseInt(str.split(",")[1]);
            total += score;
            lineCnt++;

            pw.printf("%s의 점수는 %d점 입니다.\n", name, score);
        }
        br.close();

        pw.printf("모두의 총점은 %d점 입니다.\n", total);
        pw.printf("모두의 평균은 %d점 입니다.", total / lineCnt);
        pw.close();
    }

    //Main
    public static void main(String[] args) throws Exception {
        Grade grade = new Grade();
        String fileName = "files/score.txt";
        grade.printGrade(fileName);

    }//end of main

}//end of class
