package day02.test;

// 입력받은 단수를 출력하는 프로그램
class Example2 {
    public static void main(String[] args) {

        // count 배열 생성
        int[] countArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int dan = Integer.parseInt(args[0]);

        if (dan <= 0 || dan >= 10) {
            System.out.println("다시 실행하세요.");
        } else {
            System.out.println(dan + "단을 출력합니다.");
            for (int i = 0; i < countArray.length; i++) {
                System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1));
            }
        }
    }
}