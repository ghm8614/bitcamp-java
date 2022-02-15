package com.bitcamp.web.java.oop.jb03.part06;

import com.bitcamp.web.java.oop.jb03.part06.Developer2;

// Developer2 에서 정의한 getter method를 통해,
// Developer2의 필드 정보를 가져온다.
public class Developer2Test {
    public static void main(String[] args) {

        Developer2 developer = new Developer2();

        System.out.println("developer.name = " + developer.name);
        System.out.println("developer.job = " + developer.job);
        System.out.println("developer.avgIncome = " + developer.avgIncome);
        System.out.println("developer.projectCareer = " + developer.projectCareer);

        System.out.println("================");

        // 추가사항
        // method를 호출하여 행위를 통해 상태값 받아 출력
        String name = developer.getName();
        String job = developer.getJob();
        int avgIncome = developer.getAvgIncome();
        int projectCareer = developer.getProjectCareer();

        System.out.println("name = " + name);
        System.out.println("job = " + job);
        System.out.println("avgIncome = " + avgIncome);
        System.out.println("projectCareer = " + projectCareer);
    }
}
