package com.bitcamp.web.java.oop.jb03.part03;

import com.bitcamp.web.java.oop.jb03.part03.Developer;

public class DeveloperTest {
    public static void main(String[] args) {

        Developer developer = new Developer();

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
    }
}
