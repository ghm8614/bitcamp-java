package com.bitcamp.web.java.oop.jp03.part01;

import java.io.IOException;
import java.io.InputStream;

// java.io package : ���α׷� �ܺο��� �ڿ��� �ްų�, ������ ��쿡 ���
public class InputTest {

    //Main
    public static void main(String[] args) {

        //InputStream : ǥ���Է���ġ�� �߻�ȭ�� class
        InputStream inputStream = System.in;

        System.out.println("�Է��� ��ٸ��ϴ�.");

        try {
            // ���� �о���̴� ���ѷ��� ����
            while (true) {

                // 1. java.io�� ����?block? �� �� �ִ�.
                int i = inputStream.read();
                char c = (char) i;

                // 2. java.io�� FIFO ���� (Queue ����)
                System.out.println("�Է��Ͻ� �� :" + c);

                // -> char 'X' �� �ԷµǸ� while ����
                if (c == 'x') {
                    inputStream.close();
                    break;
                }
                // �ѱ� �Է� ��, ������.  �ѱ� 1EA�� 2�� ����� �� Ȯ��
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//end of main
}//end of class
