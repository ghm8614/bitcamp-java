package com.bitcamp.web.java.oop.jp03.part04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 1. read() 보다 효율적인 method를 제공하는 class 사용
// 2. Sink stream : Data를 직접 주고 받는 단순입출력 Stream
// 3. Filter stream : Sink Stream을 통해 들어온 Data를 조작하는 Stream
public class BufferedReaderTest {

    //Main
    public static void main(String[] args) throws Exception {

        int readCount = 0;

        // SinkStream : 말단에서 단순 입출력만 담당
        FileReader fr = new FileReader(args[0]);

        // FileStream : 추가적인 기능을 제공
        BufferedReader br = new BufferedReader(fr);

        // 위 두 줄과 동일
        //BufferedReader br = new BufferedReader(new FileReader(args[0]));

        String oneLine = null;

        while (true) {

            readCount++;

            oneLine = br.readLine(); // API 확인
            if (oneLine == null) {
                break;
            }
            System.out.println("한줄 출력: " + readCount + " " + oneLine);
        }

        //Stream close
        br.close();
        fr.close();

    }//end of main
}//end of class
