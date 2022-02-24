package com.bitcamp.web.java.oop.jp03.part02;

import java.io.*;

public class WriterTest {

    //Main
    public static void main(String[] args) {

        try {
            InputStream inputStream = System.in;
            Reader reader = new InputStreamReader(inputStream);

            //OutputStream : ǥ�������ġ�� �߻�ȭ�� class
            OutputStream outputStream = System.out;
            //����ó���� ���� Writer�� ����
            Writer writer = new OutputStreamWriter(outputStream);

            System.out.println("�Է��� ��ٸ��ϴ�.");

            while (true) {
                int i = reader.read();
                writer.write(i);
                writer.flush();

                if ((char) i == 'x') {
                    break;
                }
            }

            // while �� ������ flush()�� ���� flush()�� �ǹ̴�?
            //w.flush();

            //Stream close()
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
