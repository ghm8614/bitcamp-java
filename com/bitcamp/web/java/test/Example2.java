package day02.test;

// �Է¹��� �ܼ��� ����ϴ� ���α׷�
class Example2 {
    public static void main(String[] args) {

        // 1. dan �Է¹ޱ�
        int dan = Integer.parseInt(args[0]);

        // 2. count�� for������
        if (dan <= 0 | dan >= 10) {
            System.out.println("�ٽ� �����ϼ���.");
        } else {
            System.out.println(dan + "���� ����մϴ�.");
            for (int count = 1; count < 10; count++) {
                System.out.printf("%d * %d = %d\n", count, dan, count * dan);
            }
        }

        /*
        // �迭 �̿�

        // 1. dan �Է¹ޱ�
        int dan = Integer.parseInt(args[0]);

        // 2. count�� �迭��
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (dan <= 0 || dan >= 10) {
            System.out.println("�ٽ� �����ϼ���.");
        } else {
            System.out.println(dan + "���� ����մϴ�.");
            for (int i = 0; i < intArray.length; i++) {
                System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1));
            }
        }
         */
    }
}