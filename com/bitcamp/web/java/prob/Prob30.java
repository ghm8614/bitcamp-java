package com.bitcamp.web.java.prob;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Prob30 {

    //M
    // 10���� �ߺ����� �ʴ� ������ �����Ͽ�
    // �迭�� ������ ����
    public static int[] generateRandomNumber() {

        int[] randomNum = new int[10];
        Random random = new Random();

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(20) + 1;
        }

        return randomNum;
    }

    // 10���� ���� �迭�� �Ű������� �޾�
    // �߻��� ������ ��������� store.txt ���Ͽ� ���
    public static void printStatistics(int[] array) {

        int size = array.length;
        double total = 0;


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/store.txt"))) {

            for (int i = 0; i < size; i++) {
                total += array[i];
                bw.write(array[i] + "");
                bw.newLine();
            }

            Arrays.sort(array);

            bw.write("�ִ밪 : " + array[0] + "\n");
            bw.write("�ּҰ� : " + array[size - 1] + "\n");
            bw.write("��հ� : " + total / size);
//            bw.flush();  //

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Main
    public static void main(String[] args) {
        int[] array = generateRandomNumber();
        printStatistics(array);

    }
}
