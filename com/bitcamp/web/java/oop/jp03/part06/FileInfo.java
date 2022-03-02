package com.bitcamp.web.java.oop.jp03.part06;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfo {

    //Main
    public static void main(String[] args) {

        System.out.println("���� �̸��� �������� ");

        String name = "";
        // NullString : String str = new String();
        // String str = null; �� �ٸ���. �����ϱ�

        // ���� �̸��� �޾Ƶ���
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            name = in.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // file Ŭ���� �ν��Ͻ� ����
        File file = new File(name);

        //file�� �����Ѵٸ� file ���õ� information ���
        if (file.exists()) {
            System.out.println("���� �̸� : " + file.getName());
            System.out.println("��� �н�: " + file.getPath());
            System.out.println("���� �н� : " + file.getAbsolutePath());
            System.out.println("���� ���� : " + file.canWrite());
            System.out.println("�б� ���� : " + file.canRead());
            System.out.println("���� ���� : " + file.length() + "����Ʈ");
        }else {
            System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
        }

    }//end of main

}//end of class
