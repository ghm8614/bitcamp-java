package com.bitcamp.web.java.prob;

import java.util.List;
import java.util.Vector;

public class Prob31 {

    //Main
    public static void main(String[] args) throws Exception {
        // ���� ������ ���� filenName ����
        String pathName = "files/data2.txt";

        //data.txt ���� ���
        FileUtil.fileToPrint(pathName);


        System.out.println("========================");
        System.out.println("���� ���� �� ���� ���� �˻�");
        List<User> vector = FileUtil.fileFindAddress(pathName, "����");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        System.out.println("========================");
        System.out.println("���� ���� �� ���� ���� �˻�");
        vector = FileUtil.fileFindAddress(pathName, "����");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i).toString());
        }

        System.out.println("========================");
        System.out.println("���� ���� �� ��⵵ ���� �˻�");
        vector = FileUtil.fileFindAddress(pathName, "��⵵");
        for (User user : vector) {
            System.out.println(user);
        }


    }//end of main

}//end of class