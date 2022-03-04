package com.bitcamp.web.java.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class FileUtil {

    // 파라미터로 받은 파일의 내용을 화면에 출력
    public static void fileToPrint(String fileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        PrintWriter pw = new PrintWriter(System.out);

        String oneLine;
        while ((oneLine = br.readLine()) != null) {
            pw.println(":: " + oneLine);
        }
        pw.flush(); //

    }

    // 파라미터로 받은 파일을 한줄씩 읽는다.
    // 입력받은 address가 있는 라인을 파싱한다.("/")
    // 파싱한 값을 User 인스턴스의 상태값으로 지정
    // vector 인스턴스 저장 후 리턴
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
                boolean isMale = male.equals("남");

                vector.add(new User(name, address, cellularNumber, isMale));
            }
        }//end of while

        return vector;

    }

}
