package com.bitcamp.web.java.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// 입력받은 배열의 값을 vector 에 반대로 저장하는 메서드
// 방법 1. 입력받은 배열 순차적으로 접근
// 방법 2. 입력받은 배열 역순으로 접근
public class ArrayCopy {

    public List<String> moveToVector1(String[] arr) {

        List<String> vector = new ArrayList<>(); // 기본 생성자로 인스턴스 생성 시, 초기용량 10 자동 설정

        for (int i = 0; i < arr.length; i++) {
            vector.add(0, arr[i]);    // index : 0부터...
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
        System.out.println("순차적 접근: " + ac.moveToVector1(datas));
        System.out.println("역순으로 접근: " + ac.moveToVector2(datas));
    }
}
