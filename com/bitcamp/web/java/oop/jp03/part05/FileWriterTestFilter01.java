package com.bitcamp.web.java.oop.jp03.part05;

import java.io.*;

// File copy�ϴ� Application �ۼ�
// 1. fileName �Է�
// 2. ���� ������ read() -> FileReader
// 3. ���� �ۼ�  write() -> FileWriter
public class FileWriterTestFilter01 {

    //Main
    public static void main(String[] args) throws IOException {

        // �ʿ� �ν��Ͻ� Stream/String �ν��Ͻ� ����
        BufferedReader br = null;
        BufferedWriter bw = null;
        String fileName = "";
        String copyFileName = "";

        int readCount = 0;

        System.out.println("copy �� file �̸��� �Է��ϼ���.");
        fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        // �������� Data�� read �� �� �ִ� BufferedReader ����
        br = new BufferedReader(new FileReader(fileName));

        // �纻���� �̸� �����
        copyFileName = fileName + "_copy";

        // data�� write �� �� �ִ� BufferedWriter ����
        bw = new BufferedWriter(new FileWriter(copyFileName));

        // read/writer �ϴ� while ��
        String source = null;
        while ((source = br.readLine()) != null) {
            bw.write(source);
            readCount++;
        }
        bw.flush();

        // Stream close()
        bw.close();
        br.close();

        System.out.println("====================================");
        System.out.println("readCount: " + readCount);
        System.out.println("====================================");

    }//end of main
}//end of class
