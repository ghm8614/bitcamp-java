package com.bitcamp.web.java.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class Prob28 {

    // ���پ� �д´�.
    // (/)�� �������� �Ľ�
    // �Ľ��ؼ� Score2 �ν��Ͻ��� �ʵ尪 �ֱ�(������ or setter)
    // Vector �� �ν��Ͻ� �ֱ�

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
                    passOrFail = "����";
                } else {
                    passOrFail = "�̼���";
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
            System.out.println(scores.get(i));  // toString ����
        }
    }
}
