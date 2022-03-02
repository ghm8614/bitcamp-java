package com.bitcamp.web.java.oop.jp03.part06;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream 을 이용해서 회원정보를 가지는 UserVO instance 를
// persistence data(파일) 로 저장
public class WriteObjectFile {

    //Main
    public static void main(String[] args) throws Exception {

        // 1. 인스턴스를 파일에 저장할 SinkStream : FileOutputStream 생성
        // 2. 인스턴스를 전송하는 FilterStream : ObjectOutputStream 생성
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

        oos.writeObject(new UserVO(1, "홍길동"));
        oos.writeObject(new UserVO(2, "홍길순"));
        oos.flush();

        //Stream close()
        oos.close();

    }//end of main

}//end of class
