package com.bitcamp.web.java.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class Prob27 {

    //한줄씩 읽기
    // ("/") 를 기준으로 파싱하기
    // Score 인스턴스를 생성하면서 인스턴스에 필드값 넣기(setter or 생성자)
    // 각각의 인스턴스를 Vector 에 넣기

    //M
    public List<Score> getScore(String fileName) {

        List<Score> vector = new Vector<>();

        String name;
        int kor;
        int eng;
        int math;
        int sum;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String oneLine;
            while ((oneLine = br.readLine()) != null) {

                name = oneLine.split("/")[0];
                kor = Integer.parseInt(oneLine.split("/")[1]);
                eng = Integer.parseInt(oneLine.split("/")[2]);
                math = Integer.parseInt(oneLine.split("/")[3]);
                sum = kor + eng + math;

                vector.add(new Score(name, kor, eng, math, sum));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return vector;
    }


    //Main
    public static void main(String[] args) {

        Prob27 p2 = new Prob27();
        List<Score> scores = p2.getScore("files/data.txt");
        for (int i = 0; i < scores.size(); i++) {
            Score score = scores.get(i);
            System.out.println(score.getName() + " : " + score.getKor() + " " + score.getEng() + " "
                    + score.getMath() + " " + score.getSum());
        }

    }
}
