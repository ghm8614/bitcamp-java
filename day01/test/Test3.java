package day01.test;

public class Test3 {
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // i
        if (i % 2 == 0) {
            System.out.printf((i % 3 == 0) ? "%d: ¦���̸� 3�� ����̴�.\n" : "%d: ¦���̸� 3�� ����� �ƴϴ�.\n", i);
        } else {
            System.out.printf((i % 3 == 0) ? "%d: Ȧ���̸� 3�� ����̴�.\n" : "%d: Ȧ���̸� 3�� ����� �ƴϴ�.\n", i);
        }

        // j
        if (j % 2 == 0) {
            System.out.printf((j % 3 == 0) ? "%d: ¦���̸� 3�� ����̴�.\n" : "%d: ¦���̸� 3�� ����� �ƴϴ�.\n", j);
        } else {
            System.out.printf((j % 3 == 0) ? "%d: Ȧ���̸� 3�� ����̴�.\n" : "%d: Ȧ���̸� 3�� ����� �ƴϴ�.\n", j);
        }
    }
}