package com.bitcamp.web.java.oop.jp03.part03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    //Main
    public static void main(String[] args) {

        // File �� �о���̴� Stream ����
        FileInputStream fis = null;
        // read() �� count�ϱ� ���� ���� ����
        int readCount = 0;

        try {
            fis = new FileInputStream(args[0]);

            while (true) {
                int i = fis.read();

                if (i == -1) {  // -1�� �ǹ��ϴ� ����?
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
