package com.bitcamp.web.java.oop;

public class Developer {

    String name = "홍길동";
    String job = "개발자";
    int avgIncome = 100;
    int projectCareer;

    public void participateProject() {
        System.out.println("프로그램 개발로 수입증가, 경력추가");
        avgIncome++;
        projectCareer++;
    }

    public void instruct() {
        System.out.println("강의를 통한 수입증가");
        avgIncome++;
    }
}
