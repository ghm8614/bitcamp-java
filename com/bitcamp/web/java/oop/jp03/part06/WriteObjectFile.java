package com.bitcamp.web.java.oop.jp03.part06;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream �� �̿��ؼ� ȸ�������� ������ UserVO instance ��
// persistence data(����) �� ����
public class WriteObjectFile {

    //Main
    public static void main(String[] args) throws Exception {

        // 1. �ν��Ͻ��� ���Ͽ� ������ SinkStream : FileOutputStream ����
        // 2. �ν��Ͻ��� �����ϴ� FilterStream : ObjectOutputStream ����
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

        oos.writeObject(new UserVO(1, "ȫ�浿"));
        oos.writeObject(new UserVO(2, "ȫ���"));
        oos.flush();

        //Stream close()
        oos.close();

    }//end of main

}//end of class
