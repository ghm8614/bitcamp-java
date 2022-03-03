package com.bitcamp.web.java.prob;

import java.io.*;

public class Grade {

    //M
    public void printGrade(String fileName) {

        String name = "";
        int score = 0;
        int total = 0;
        int lineCnt = 0;

        // InputStream, outputStream, Reader, Writer ��� AutoCloseable �������̽��� ����
        // AutoCloseable : try-with-resource �� ����ؼ� �ڵ� close() ��� ���� (finally�� close() �� �ʿ� x)
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             PrintWriter pw = new PrintWriter(System.out, true)) {

            String str = "";
            while ((str = br.readLine()) != null) {
                name = str.split(",")[0];
                score = Integer.parseInt(str.split(",")[1]);
                total += score;
                lineCnt++;

                pw.printf("%s�� ������ %d�� �Դϴ�.\n", name, score);
            }

            pw.printf("����� ������ %d�� �Դϴ�.\n", total);
            pw.printf("����� ����� %d�� �Դϴ�.", total / lineCnt);
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
