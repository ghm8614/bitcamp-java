package com.bitcamp.web.java.oop.jp03.part01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStream 은 한글처리(2byte)가 되지 않는다.
// 문자를 처리하는 Reader 계열로 바꾸자.
public class ReaderTest {

    //Main
    public static void main(String[] args) {

        try {
            InputStream inputStream = System.in;

            // Reader로 변경
            Reader reader = new InputStreamReader(inputStream);

            System.out.println("입력을 기다립니다.");

            // 값을 읽는 무한루프 시작
            while (true) {

                // 1. java.io는 지연?block? 될 수 있다.
                int i = reader.read();
                char c = (char) i;

                // 2. java.io는 FIFO 구조 (Queue 구조)
                System.out.println("입력하신 값 :" + c);

                // -> char 'X' 가 입력되면 while 종료
                if (c == 'x') {
                    inputStream.close();
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end of main
}//end of class
