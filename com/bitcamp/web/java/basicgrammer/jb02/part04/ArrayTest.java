package com.bitcamp.web.java.basicgrammer.jb02.part04;

// array : ���� ������Ÿ�� ������ ����
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

        // �迭 ����� �ʱ�ȭ ���ÿ� �۾�
        // int[] intArray = {1,2,3,4,5,6,7,8,9};
        // int[] intArray = new int[ ]{1,2,3,4,5,6,7,8,9};

        // index�� value�� ����
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] :" + intArray[i]);
        }
        System.out.println("===============");

        // �� �迭 Ȱ���ؼ� ������ 5�� �����
        for (int k = 0; k < intArray.length; k++) {
            System.out.println("5 X " + intArray[k] + "=" + 5 * intArray[k]);
        }

        // ���ο� �迭 �����ϰ� �����迭�� �ּҰ� ���� (���� �޸𸮸� ����Ŵ)
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
