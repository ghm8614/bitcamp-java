package com.bitcamp.web.java.prob;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob32 {
    //M
    // ��� �Է¹޾� ���� �����ϴ� �޼���
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

        System.out.print("�й��� �Է��ϼ��� : ");
        strNum = keyboard.nextLine();
        System.out.print("���� ������ �Է��ϼ��� : ");
        kor = keyboard.nextInt();
        System.out.print("���� ������ �Է��ϼ��� : ");
        math = keyboard.nextInt();
        System.out.print("���� ������ �Է��ϼ��� : ");
        eng = keyboard.nextInt();
        System.out.print("�ڹ� ������ �Է��ϼ��� : ");
        java = keyboard.nextInt();

        // ����
        // 1. sum,avg ���
        sum = kor + math + eng + java;
        avg = (double) sum / 4;

        // 2. ���� ���ϴ� checkGrade() ȣ��
        char grade = checkGrade(avg);

        // 3. grade.txt �����ۼ�
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/grade.txt"))) {
            bw.write("---------------\n");
            bw.write("�й� : " + strNum + "\n");
            bw.write("---------------\n");
            bw.write("���� : " + kor + "\n");
            bw.write("���� : " + math + "\n");
            bw.write("���� : " + eng + "\n");
            bw.write("�ڹ� : " + java + "\n");
            bw.write("---------------\n");
            bw.write("���� : " + sum + "\n");
            bw.write("��� : " + avg + "\n");
            bw.write("���� : " + grade);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end of main

}//end of class
