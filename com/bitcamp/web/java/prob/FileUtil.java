package com.bitcamp.web.java.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class FileUtil {

    // �Ķ���ͷ� ���� ������ ������ ȭ�鿡 ���
    public static void fileToPrint(String fileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        PrintWriter pw = new PrintWriter(System.out);

        String oneLine;
        while ((oneLine = br.readLine()) != null) {
            pw.println(":: " + oneLine);
        }
        pw.flush(); //

    }

    // �Ķ���ͷ� ���� ������ ���پ� �д´�.
    // �Է¹��� address�� �ִ� ������ �Ľ��Ѵ�.("/")
    // �Ľ��� ���� User �ν��Ͻ��� ���°����� ����
    // vector �ν��Ͻ� ���� �� ����
    public static Vector<User> fileFindAddress(String fileName, String address) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        Vector<User> vector = new Vector<>();

        String oneLine;
        while ((oneLine = br.readLine()) != null) {
            if (oneLine.contains(address)) {
                StringTokenizer st = new StringTokenizer(oneLine, "/");

                String name = st.nextToken();
                st.nextToken();
                String cellularNumber = st.nextToken();
                String male = st.nextToken();
                boolean isMale = male.equals("��");

                vector.add(new User(name, address, cellularNumber, isMale));
            }
        }//end of while

        return vector;

    }

}
