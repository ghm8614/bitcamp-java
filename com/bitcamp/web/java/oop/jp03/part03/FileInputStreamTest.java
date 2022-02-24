package com.bitcamp.web.java.oop.jp03.part03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    //Main
    public static void main(String[] args) {

        // File 을 읽어들이는 Stream 선언
        FileInputStream fis = null;
        // read() 를 count하기 위한 변수 선언
        int readCount = 0;

        try {
            fis = new FileInputStream(args[0]);

            while (true) {
                int i = fis.read();

                if (i == -1) {  // -1을 의미하는 것은?
                    break;
                }
                char c = (char) i;
                System.out.println(c);

                readCount++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("===========================");
            System.out.println("====> readCount: " + readCount);
            System.out.println("===========================");
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//end of main
}//end of class
