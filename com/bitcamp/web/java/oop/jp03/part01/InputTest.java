package com.bitcamp.web.java.oop.jp03.part01;

import java.io.IOException;
import java.io.InputStream;

// java.io package : 프로그램 외부에서 자원을 받거나, 전달할 경우에 사용
public class InputTest {

    //Main
    public static void main(String[] args) {

        //InputStream : 표준입력장치를 추상화한 class
        InputStream inputStream = System.in;

        System.out.println("입력을 기다립니다.");

        try {
            // 값을 읽어들이는 무한루프 시작
            while (true) {

                // 1. java.io는 지연?block? 될 수 있다.
                int i = inputStream.read();
                char c = (char) i;

                // 2. java.io는 FIFO 구조 (Queue 구조)
                System.out.println("입력하신 값 :" + c);

                // -> char 'X' 가 입력되면 while 종료
                if (c == 'x') {
                    inputStream.close();
                    break;
                }
                // 한글 입력 시, 꺠진다.  한글 1EA당 2개 생기는 것 확인
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//end of main
}//end of class
