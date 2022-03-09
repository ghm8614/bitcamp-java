package com.bitcamp.web.java.prob;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Prob30 {

    //M
    // 중복되지 않는 난수 (java.util.Set / java.util.Random)
    // 배열에 저장후 리턴
    public static int[] generateRandomNumber() {

        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        // 중복 제거하면서 set 에 10개 난수 넣기
        while (true) {
            set.add(random.nextInt(20) + 1);
            if (set.size() == 10) {
                break;
            }
        }

        // set의 값들을 배열에 넣기 (향상된 for, Iterator)
        //방법1
        int[] randomArr = new int[set.size()];
        int i = 0;
        for (int randomNum : set) {
            randomArr[i++] = randomNum;
        }

        /*
        //방법2
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            randomArr[i++] = iter.next();
        }
        */

        return randomArr;
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
            bw.flush();  //

            Arrays.sort(array);
            bw.write("최대값 : " + array[0] + "\n");
            bw.write("최소값 : " + array[size - 1] + "\n");
            bw.write("평균값 : " + total / size);

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
