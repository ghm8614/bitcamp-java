package com.bitcamp.web.java.oop.jp03.part05;

import java.io.*;

// Ű����� �Է¹��� ���� test.txt�� ������ App �ۼ�
public class FileWriterTestFilter02 {

    //Main
    public static void main(String[] args) throws IOException {

        // �ʿ� �ν��Ͻ� Stream/String �ν��Ͻ� ����
        BufferedReader br = null;
        BufferedWriter bw = null;

        // Ű����� �Է¹ޱ� ���� Sink Stream Reader �� 
        // �Ѱ��� ������ �б� ���� readLine()�� �����ϴ� BufferedReader ����
        br = new BufferedReader(new InputStreamReader(System.in));

        // File�� �� �������� FileWriter �� BufferWriter ����
        bw = new BufferedWriter(new FileWriter("test.txt"));

        System.out.println("���Ͽ� ������ ���� �Է��ϼ���");
        while (true) {
            String str = br.readLine();
            if (str.equals("��")) {
                break;
            }
            bw.write(str, 0, str.length());
            bw.newLine();
        }
        bw.flush();
        
        br.close();
        bw.close();

    }//end of main
}//end of class
