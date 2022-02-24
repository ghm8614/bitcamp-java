package com.bitcamp.web.java.oop.jp03.part01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStream �� �ѱ�ó��(2byte)�� ���� �ʴ´�.
// ���ڸ� ó���ϴ� Reader �迭�� �ٲ���.
public class ReaderTest {

    //Main
    public static void main(String[] args) {

        try {
            InputStream inputStream = System.in;

            // Reader�� ����
            Reader reader = new InputStreamReader(inputStream);

            System.out.println("�Է��� ��ٸ��ϴ�.");

            // ���� �д� ���ѷ��� ����
            while (true) {

                // 1. java.io�� ����?block? �� �� �ִ�.
                int i = reader.read();
                char c = (char) i;

                // 2. java.io�� FIFO ���� (Queue ����)
                System.out.println("�Է��Ͻ� �� :" + c);

                // -> char 'X' �� �ԷµǸ� while ����
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
