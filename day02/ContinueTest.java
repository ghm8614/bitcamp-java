package day02;

// continue : continue ������ ���� �����ߴ��ϰ� �ݺ��� ó������ ����.
// continue ���� �̿��ؼ� ¦���� ���ϱ�
// �ܼ�â ���Է�
class ContinueTest {
    public static void main(String[] args) {
        int inputData = Integer.parseInt(args[0]);

        int sum = 0;
        for (int i = 0; i <= inputData; i++) {
            if (i % 2 == 1) {
                continue;
            } else {
                sum = sum + i;
            }
        }
        System.out.println("0 ~ " + inputData + " ������ ¦���� ���� : " + sum);
    }
}