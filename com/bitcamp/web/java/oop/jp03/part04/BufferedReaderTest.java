package com.bitcamp.web.java.oop.jp03.part04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 1. read() ���� ȿ������ method�� �����ϴ� class ���
// 2. Sink stream : Data�� ���� �ְ� �޴� �ܼ������ Stream
// 3. Filter stream : Sink Stream�� ���� ���� Data�� �����ϴ� Stream
public class BufferedReaderTest {

    //Main
    public static void main(String[] args) throws Exception {

        int readCount = 0;

        // SinkStream : ���ܿ��� �ܼ� ����¸� ���
        FileReader fr = new FileReader(args[0]);

        // FileStream : �߰����� ����� ����
        BufferedReader br = new BufferedReader(fr);

        // �� �� �ٰ� ����
        //BufferedReader br = new BufferedReader(new FileReader(args[0]));

        String oneLine = null;

        while (true) {

            readCount++;

            oneLine = br.readLine(); // API Ȯ��
            if (oneLine == null) {
                break;
            }
            System.out.println("���� ���: " + readCount + " " + oneLine);
        }

        //Stream close
        br.close();
        fr.close();

    }//end of main
}//end of class
