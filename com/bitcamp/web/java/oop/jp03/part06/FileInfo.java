package com.bitcamp.web.java.oop.jp03.part06;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfo {

    //Main
    public static void main(String[] args) {

        System.out.println("파일 이름을 넣으세요 ");

        String name = "";
        // NullString : String str = new String();
        // String str = null; 과 다르다. 구분하기

        // 파일 이름을 받아들임
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            name = in.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // file 클래스 인스턴스 생성
        File file = new File(name);

        //file이 존재한다면 file 관련된 information 출력
        if (file.exists()) {
            System.out.println("파일 이름 : " + file.getName());
            System.out.println("상대 패스: " + file.getPath());
            System.out.println("절대 패스 : " + file.getAbsolutePath());
            System.out.println("쓰기 가능 : " + file.canWrite());
            System.out.println("읽기 가능 : " + file.canRead());
            System.out.println("파일 길이 : " + file.length() + "바이트");
        }else {
            System.out.println("해당 파일은 존재하지 않습니다.");
        }

    }//end of main

}//end of class
