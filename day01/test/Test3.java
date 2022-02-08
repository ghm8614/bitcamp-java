package day01.test;

public class Test3 {
    public static void main(String[] args) {
        // 콘솔창에서 두 문자열 입력받고, int로 변환
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // 두 수가 짝수, 홀수, 3의 배수 인지 아닌지 판단하기 (4가지 경우의수)
        if (i % 3 == 0) {  // 모두 3의 배수
            if (i % 2 == 0) {  // 짝
                System.out.println(i + " : 3의 배수이면서 짝수다.");
            } else {  // 홀
                System.out.println(i + " : 3의 배수이면서 홀수다.");
            }
        } else {  // 모두 3의 배수 아님
            if (i % 2 == 0) {  // 짝
                System.out.println(i + " : 3의 배수가 아니면서 짝수다.");
            } else {  // 홀
                System.out.println(i + " : 3의 배수가 아니면서 홀수다.");
            }
        }

        if (j % 3 == 0) {  // 모두 3의 배수
            if (j % 2 == 0) {  // 짝
                System.out.println(j + " : 3의 배수이면서 짝수다.");
            } else {  // 홀
                System.out.println(j + " : 3의 배수이면서 홀수다.");
            }
        } else {  // 모두 3의 배수 아님
            if (j % 2 == 0) {  // 짝
                System.out.println(j + " : 3의 배수가 아니면서 짝수다.");
            } else {  // 홀
                System.out.println(j + " : 3의 배수가 아니면서 홀수다.");
            }
        }
    }
}