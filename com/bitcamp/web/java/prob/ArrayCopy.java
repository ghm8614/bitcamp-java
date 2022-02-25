package com.bitcamp.web.java.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// �Է¹��� �迭�� ���� vector �� �ݴ�� �����ϴ� �޼���
// ��� 1. �Է¹��� �迭 ���������� ����
// ��� 2. �Է¹��� �迭 �������� ����
public class ArrayCopy {

    public List<String> moveToVector1(String[] arr) {

        List<String> vector = new ArrayList<>(); // �⺻ �����ڷ� �ν��Ͻ� ���� ��, �ʱ�뷮 10 �ڵ� ����

        for (int i = 0; i < arr.length; i++) {
            vector.add(0, arr[i]);    // index : 0����...
//            System.out.println(vector.toString());
        }
        return vector;
    }


    public List<String> moveToVector2(String[] arr) {

        List<String> vector = new Vector<>();

        int size = arr.length;
        for (int i = size - 1; i >= 0; i--) {
            vector.add(arr[i]);
        }
        return vector;
    }


    //Main
    public static void main(String[] args) {

        ArrayCopy ac = new ArrayCopy();
        String[] datas = {"1", "2", "3", "4", "5"};
        String a = "123";
        System.out.println("������ ����: " + ac.moveToVector1(datas));
        System.out.println("�������� ����: " + ac.moveToVector2(datas));
    }
}
