package day02.test;

// 1�� ~9�� ����ϴ� ���α׷�
class Example4 {
    public static void main(String[] args) {

        for (int dan = 1; dan < 10; dan++) {
            System.out.printf("%d���� ����մϴ�.\n", dan);
            for (int count = 1; count < 10; count++) {
                System.out.printf("%d * %d = %d\n", dan, count, dan * count);
            }
        }
    }
}

