package com.bitcamp.web.java.oop;

public class Developer1Test {
    public static void main(String[] args) {

        Developer1 developer = new Developer1();

        System.out.println("developer.name = " + developer.name);
        System.out.println("developer.job = " + developer.job);
        System.out.println("developer.avgIncome = " + developer.avgIncome);
        System.out.println("developer.projectCareer = " + developer.projectCareer);

        System.out.println("================");

        developer.participateProject();
        System.out.println("developer.avgIncome = " + developer.avgIncome);
        System.out.println("developer.projectCareer = " + developer.projectCareer);

        developer.instruct();
        System.out.println("developer.avgIncome = " + developer.avgIncome);

        // 추가사항
        System.out.println("==== 추가사항 ====");
        String projectName = "한미은행";
        developer.participateProject(projectName);
        System.out.println("developer.avgIncome = " + developer.avgIncome);
        System.out.println("developer.projectCareer = " + developer.projectCareer);

        System.out.println("================");

        int lectureCount = 2;
        developer.instruct(lectureCount);
        System.out.println("developer.avgIncome = " + developer.avgIncome);
    }
}
