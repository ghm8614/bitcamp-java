package day02.test;

// �Է¹��� �ܼ��� ����ϴ� ���α׷�
class Example2 {
    public static void main(String[] args) {

        // count �迭 ����
        int[] countArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int dan = Integer.parseInt(args[0]);

        if (dan <= 0 || dan >= 10) {
            System.out.println("�ٽ� �����ϼ���.");
        } else {
            System.out.println(dan + "���� ����մϴ�.");
            for (int i = 0; i < countArray.length; i++) {
                System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1));
            }
        }
    }
}