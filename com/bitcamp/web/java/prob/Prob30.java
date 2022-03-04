package com.bitcamp.web.java.prob;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Prob30 {

    //M
    // 10개의 중복되지 않는 난수를 생성하여
    // 배열에 저장후 리턴
    public static int[] generateRandomNumber() {

        int[] randomNum = new int[10];
        Random random = new Random();

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(20) + 1;
        }

        return randomNum;
    }

    // 10개의 난수 배열을 매개변수로 받아
    // 발생된 난수와 통계정보를 store.txt 파일에 출력
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

            bw.write("최대값 : " + array[0] + "\n");
            bw.write("최소값 : " + array[size - 1] + "\n");
            bw.write("평균값 : " + total / size);
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
