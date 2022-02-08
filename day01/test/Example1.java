package day01.test;

public class Example1 {
    public static void main(String[] args) {
        // 콘솔창에 문자열  입력받고, int로 변환
        int score = Integer.parseInt(args[0]);

        // 조건에 따라 출력
        if (score >= 90) {
            System.out.println("입력하신 값" + score + "점은 수입니다.");
        } else if (score >= 80) {
            System.out.println("입력하신 값" + score + "점은 우입니다.");
        } else if (score >= 70) {
            System.out.println("입력하신 값" + score + "점은 미입니다.");
        } else if (score >= 60) {
            System.out.println("입력하신 값" + score + "점은 양입니다.");
        } else {
            System.out.println("입력하신 값" + score + "점은 가입니다.");
        }
    }
}
