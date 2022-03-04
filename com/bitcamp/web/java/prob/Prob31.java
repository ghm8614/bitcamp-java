package com.bitcamp.web.java.prob;

import java.util.Vector;

public class Prob31 {

    //Main
    public static void main(String[] args) throws Exception {
        // 고객 정보를 갖는 filenName 선언
        String pathName = "files/data2.txt";

        //data.txt 내용 출력
        FileUtil.fileToPrint(pathName);


        System.out.println("========================");
        System.out.println("파일 내용 중 서울 정보 검색");
        Vector<User> vector = FileUtil.fileFindAddress(pathName, "서울");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        System.out.println("========================");
        System.out.println("파일 내용 중 경주 정보 검색");
        vector = FileUtil.fileFindAddress(pathName, "경주");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i).toString());
        }

        System.out.println("========================");
        System.out.println("파일 내용 중 경기도 정보 검색");
        vector = FileUtil.fileFindAddress(pathName, "경기도");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i).toString());
        }


    }//end of main

}//end of class
