package day01.test;

public class Test3 {
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // i
        if (i % 2 == 0) {
            System.out.printf((i % 3 == 0) ? "%d: 짝수이며 3의 배수이다.\n" : "%d: 짝수이며 3의 배수가 아니다.\n", i);
        } else {
            System.out.printf((i % 3 == 0) ? "%d: 홀수이며 3의 배수이다.\n" : "%d: 홀수이며 3의 배수가 아니다.\n", i);
        }

        // j
        if (j % 2 == 0) {
            System.out.printf((j % 3 == 0) ? "%d: 짝수이며 3의 배수이다.\n" : "%d: 짝수이며 3의 배수가 아니다.\n", j);
        } else {
            System.out.printf((j % 3 == 0) ? "%d: 홀수이며 3의 배수이다.\n" : "%d: 홀수이며 3의 배수가 아니다.\n", j);
        }
    }
}