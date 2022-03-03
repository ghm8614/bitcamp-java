package com.bitcamp.web.java.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class Prob28 {

    // 한줄씩 읽는다.
    // (/)를 기준으로 파싱
    // 파싱해서 Score2 인스턴스에 필드값 넣기(생성자 or setter)
    // Vector 에 인스턴스 넣기

    public List<Score2> getList() {

        List<Score2> list = new Vector<>();

        String name;
        String subject;
        int score;
        String passOrFail;

        try (BufferedReader br = new BufferedReader(new FileReader("files/list.txt"))) {
            String oneLine;
            while ((oneLine = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(oneLine, "/");
                name = st.nextToken();
                subject = st.nextToken();
                score = Integer.parseInt(st.nextToken());

                if ((subject.equalsIgnoreCase("JAVA") && score >= 80) ||
                        (subject.equalsIgnoreCase("SQL") && score >= 90)) {
                    passOrFail = "수료";
                } else {
                    passOrFail = "미수료";
                }
                list.add(new Score2(name, subject, score, passOrFail));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {

        Prob28 e = new Prob28();
        List<Score2> scores = e.getList();
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));  // toString 생략
        }
    }
}
