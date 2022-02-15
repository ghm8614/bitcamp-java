package com.bitcamp.web.java.basicgrammer.jb02.part04;

// array : 같은 데이터타입 끼리의 묶음
class ArrayTest {
    public static void main(String[] args) {
        int[] intArray = new int[9];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 7;
        intArray[7] = 8;
        intArray[8] = 9;

        // 배열 선언과 초기화 동시에 작업
        // int[] intArray = {1,2,3,4,5,6,7,8,9};
        // int[] intArray = new int[ ]{1,2,3,4,5,6,7,8,9};

        // index로 value에 접근
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] :" + intArray[i]);
        }
        System.out.println("===============");

        // 위 배열 활용해서 구구단 5단 만들기
        for (int k = 0; k < intArray.length; k++) {
            System.out.println("5 X " + intArray[k] + "=" + 5 * intArray[k]);
        }

        // 새로운 배열 생성하고 기존배열의 주소값 복사 (같은 메모리를 가리킴)
        int[] j;
        j = intArray;
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }

        j[5] = 1234;
        System.out.println("j[5] ; " + j[5]);
        System.out.println("intArray[5] ; " + intArray[5]);
    }
}
