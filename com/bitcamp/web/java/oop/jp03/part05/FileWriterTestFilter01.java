package com.bitcamp.web.java.oop.jp03.part05;

import java.io.*;

// File copy하는 Application 작성
// 1. fileName 입력
// 2. 파일 내용을 read() -> FileReader
// 3. 파일 작성  write() -> FileWriter
public class FileWriterTestFilter01 {

    //Main
    public static void main(String[] args) throws IOException {

        // 필요 인스턴스 Stream/String 인스턴스 선언
        BufferedReader br = null;
        BufferedWriter bw = null;
        String fileName = "";
        String copyFileName = "";

        int readCount = 0;

        System.out.println("copy 할 file 이름을 입력하세요.");
        fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        // 원본파일 Data를 read 할 수 있는 BufferedReader 생성
        br = new BufferedReader(new FileReader(fileName));

        // 사본파일 이름 만들기
        copyFileName = fileName + "_copy";

        // data를 write 할 수 있는 BufferedWriter 생성
        bw = new BufferedWriter(new FileWriter(copyFileName));

        // read/writer 하는 while 문
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
