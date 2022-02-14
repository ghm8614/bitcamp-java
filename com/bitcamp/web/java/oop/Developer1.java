package com.bitcamp.web.java.oop;

// 메서드 오버로딩을 통해
// 같은 메서드이름으로 다른 행위 추가
public class Developer1 {

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

    // 추가사항
    // 다형성 지원 -> 메서드 오버로딩
    public void participateProject(String project) {
        System.out.println("프로젝트 참여로 수입증가, 경력추가");
        avgIncome++;
        projectCareer++;
    }

    // 추가사항
    // 다형성 지원 -> 메서드 오버로딩
    public void instruct(int lectureCount) {
        System.out.println("강의로 수입증가");
        avgIncome += lectureCount;
    }
}
