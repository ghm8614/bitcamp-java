package com.bitcamp.web.java.prob;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Prob30 {

    //M
    // �ߺ����� �ʴ� ���� (java.util.Set / java.util.Random)
    // �迭�� ������ ����
    public static int[] generateRandomNumber() {

        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        // �ߺ� �����ϸ鼭 set �� 10�� ���� �ֱ�
        while (true) {
            set.add(random.nextInt(20) + 1);
            if (set.size() == 10) {
                break;
            }
        }

        // set�� ������ �迭�� �ֱ� (���� for, Iterator)
        //���1
        int[] randomArr = new int[set.size()];
        int i = 0;
        for (int randomNum : set) {
            randomArr[i++] = randomNum;
        }

        /*
        //���2
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            randomArr[i++] = iter.next();
        }
        */

        return randomArr;
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
            bw.flush();  //

            Arrays.sort(array);
            bw.write("�ִ밪 : " + array[0] + "\n");
            bw.write("�ּҰ� : " + array[size - 1] + "\n");
            bw.write("��հ� : " + total / size);

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
