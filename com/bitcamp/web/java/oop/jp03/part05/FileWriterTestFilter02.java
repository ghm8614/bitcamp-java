package com.bitcamp.web.java.oop.jp03.part05;

import java.io.*;

// 키보드로 입력받은 내용 test.txt로 보내는 App 작성
public class FileWriterTestFilter02 {

    //Main
    public static void main(String[] args) throws IOException {

        // 필요 인스턴스 Stream/String 인스턴스 선언
        BufferedReader br = null;
        BufferedWriter bw = null;

        // 키보드로 입력받기 위한 Sink Stream Reader 및 
        // 한개의 라인을 읽기 편한 readLine()을 제공하는 BufferedReader 생성
        br = new BufferedReader(new InputStreamReader(System.in));

        // File에 글 쓰기위한 FileWriter 및 BufferWriter 생성
        bw = new BufferedWriter(new FileWriter("test.txt"));

        System.out.println("파일에 저장할 글을 입력하세요");
        while (true) {
            String str = br.readLine();
            if (str.equals("끝")) {
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
