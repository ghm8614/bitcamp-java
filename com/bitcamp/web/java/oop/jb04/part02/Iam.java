package com.bitcamp.web.java.oop.jb04.part02;

// Human <- Iam
// Human Class 와 일반화 관계
// Human Class 와 속성과 행위를 공유하며, 구체적인 속성과 행위를 갖는다 (확장한다.)
public class Iam extends Human {

    String job;

    // Constructor
    public Iam() {
        System.out.println("Iam Class default Constructor");
    }

    // setter
    public void setJob(String job) {
        this.job = job;
    }

    // getter
    public String getJob() {
        return job;
    }

    public static void main(String[] args) {

        // 인스턴스 생성 시, 출력결과 확인
        // OOP의 일반화관계인 속성과 행위의 공유 이해하기
        // Constructor 출력결과 확인
        Iam iam = new Iam();

        System.out.println("=============================");
        // 상속받은 Human Class method
        iam.setName("홍길동");
        iam.setAge(13);
        System.out.println("iam.getName() = " + iam.getName());
        System.out.println("iam.getAge() = " + iam.getAge());

        System.out.println("=============================");
        iam.setJob("개발자");
        System.out.println("iam.getJob() = " + iam.getJob());
    }
}
