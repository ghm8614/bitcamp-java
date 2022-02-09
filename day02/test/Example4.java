package day02.test;

// 1단 ~9단 출력하는 프로그램
class Example4 {
    public static void main(String[] args) {

        for (int dan = 1; dan < 10; dan++) {
            System.out.printf("%d단을 출력합니다.\n", dan);
            for (int count = 1; count < 10; count++) {
                System.out.printf("%d * %d = %d\n", dan, count, dan * count);
            }
        }
    }
}

