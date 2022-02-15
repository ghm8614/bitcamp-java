package com.bitcamp.web.java.oop.jb03.part06;

// 필드 정보를 return하는 getter method 정의
public class Developer2 {

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

    public void participateProject(String project) {
        System.out.println("프로젝트 참여로 수입증가, 경력추가");
        avgIncome++;
        projectCareer++;
    }

    public void instruct(int lectureCount) {
        System.out.println("강의로 수입증가");
        avgIncome += lectureCount;
    }

    // 추가사항
    // 상태값을 return 하는 getter method 정의
    // 객체의 모든 정보는 Encapsulation(캡슐화) 되어 있으며,
    // 행위를 통해 Encapsulation(캡슐화) 되어있는 상태값에 접근할 수 있다.

    public String getName() {
        System.out.println("getName() Method");
        return name;
    }

    public String getJob() {
        System.out.println("getJob() Method");
        return job;
    }

    public int getAvgIncome() {
        System.out.println("getAvgIncome() Method");
        return avgIncome;
    }

    public int getProjectCareer() {
        System.out.println("getProjectCareer() Method");
        return projectCareer;
    }

}
