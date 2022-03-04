package com.bitcamp.web.java.prob;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob32 {
    //M
    // 평균 입력받아 학점 산정하는 메서드
    public static char checkGrade(double avg) {

        int value = (int) (avg / 10);
        char grade = 'F';

        switch (value) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
        }
        return grade;
    }


    //Main
    public static void main(String[] args) {
        String strNum = "";
        int kor = 0;
        int math = 0;
        int eng = 0;
        int java = 0;
        int sum = 0;
        double avg = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("학번을 입력하세요 : ");
        strNum = keyboard.nextLine();
        System.out.print("국어 성적을 입력하세요 : ");
        kor = keyboard.nextInt();
        System.out.print("수학 성적을 입력하세요 : ");
        math = keyboard.nextInt();
        System.out.print("영어 성적을 입력하세요 : ");
        eng = keyboard.nextInt();
        System.out.print("자바 성적을 입력하세요 : ");
        java = keyboard.nextInt();

        // 구현
        // 1. sum,avg 계산
        sum = kor + math + eng + java;
        avg = (double) sum / 4;

        // 2. 학점 구하는 checkGrade() 호출
        char grade = checkGrade(avg);

        // 3. grade.txt 파일작성
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/grade.txt"))) {
            bw.write("---------------\n");
            bw.write("학번 : " + strNum + "\n");
            bw.write("---------------\n");
            bw.write("국어 : " + kor + "\n");
            bw.write("수학 : " + math + "\n");
            bw.write("영어 : " + eng + "\n");
            bw.write("자바 : " + java + "\n");
            bw.write("---------------\n");
            bw.write("총점 : " + sum + "\n");
            bw.write("평균 : " + avg + "\n");
            bw.write("학점 : " + grade);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end of main

}//end of class
