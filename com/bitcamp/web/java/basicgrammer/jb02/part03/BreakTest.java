package com.bitcamp.web.java.basicgrammer.jb02.part03;

// break : 자신이 속한 반복문 종료
class BreakTest {
    public static void main(String[] args) {
        // 콘솔에서 입력받은 문자열 int로 변환
        int inputData = Integer.parseInt(args[0]);

        int i = 0;
        int sum = 0;
        while (true) {
            i++;
            sum = sum + i;
            if (i == inputData) {
                break;
            }
        }
        System.out.println("0 ~ " + inputData + "까지의 합은 : " + sum + "입니다.");
    }
}
