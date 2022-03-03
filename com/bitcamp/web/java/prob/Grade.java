package com.bitcamp.web.java.prob;

import java.io.*;

public class Grade {

    //M
    public void printGrade(String fileName) {

        String name = "";
        int score = 0;
        int total = 0;
        int lineCnt = 0;

        // InputStream, outputStream, Reader, Writer 모두 AutoCloseable 인터페이스를 구현
        // AutoCloseable : try-with-resource 를 사용해서 자동 close() 사용 가능 (finally에 close() 할 필요 x)
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             PrintWriter pw = new PrintWriter(System.out, true)) {

            String str = "";
            while ((str = br.readLine()) != null) {
                name = str.split(",")[0];
                score = Integer.parseInt(str.split(",")[1]);
                total += score;
                lineCnt++;

                pw.printf("%s의 점수는 %d점 입니다.\n", name, score);
            }

            pw.printf("모두의 총점은 %d점 입니다.\n", total);
            pw.printf("모두의 평균은 %d점 입니다.", total / lineCnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Main
    public static void main(String[] args) throws Exception {
        Grade grade = new Grade();
        String fileName = "files/score.txt";
        grade.printGrade(fileName);

    }//end of main

}//end of class
