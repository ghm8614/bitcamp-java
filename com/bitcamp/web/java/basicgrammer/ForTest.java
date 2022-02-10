package day02;

// 1. for문 이용
class ForTest {
    public static void main(String[] args) {
        int j = 5;
        System.out.println(j + "단을 출력합니다.");

        for (int i = 1; i < 10; i++) {
            System.out.println(j + "*" + i + "=" + j * i);
        }
    }
}
