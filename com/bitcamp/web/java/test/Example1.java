package day01.test;

public class Example1 {
    public static void main(String[] args) {

        int score = Integer.parseInt(args[0]);

        // 조건에 따라 출력
        if (score < 0 || score > 100) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            if (score >= 90) {
                System.out.printf("입력하신 값 %d점은 수입니다.", score);
            } else if (score >= 80) {
                System.out.printf("입력하신 값 %d점은 우입니다.", score);
            } else if (score >= 70) {
                System.out.printf("입력하신 값 %d점은 미입니다.", score);
            } else if (score >= 60) {
                System.out.printf("입력하신 값 %d점은 양입니다.", score);
            } else {
                System.out.printf("입력하신 값 %d점은 가입니다.", score);
            }
        }
    }
}
