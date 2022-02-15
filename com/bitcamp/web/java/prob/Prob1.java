package com.bitcamp.web.java.prob;

import java.util.Scanner;

// 1보다 크고 10보다 작은 수 입력받아서 구구단 출력하기
public class Prob1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1보다 크고 10보다 작은 수를 입력하세요: ");
        int dan = sc.nextInt();

        // 변수 선언
        int count = 9;

        // 1. 2보다 작거나 9보다 크면 경고메시지 출력
        if (dan < 2 || dan > 9) {
            System.out.println("잘못된 숫자가 입력되었습니다.");
            return;   // if 문이 포함된 main 메서드 종료, 즉 프로그램 종료!  break와 혼동 주의
        }

        // 2. 입력받은 단의 구구단 출력
        for (int i = 1; i <= count; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
