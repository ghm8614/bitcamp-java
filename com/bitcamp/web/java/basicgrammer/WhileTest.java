package day02;

// while��  do-while�� Ȱ�� �� ���̾˱�
class WhileTest {
    public static void main(String[] args) {
        // while ��
        int i = 0;
        while (i < 10) {
            System.out.println("\n\t����� while �� ����  i=" + i);
            i++;
        }

        // while- do ��
        int j = 0;
        do {
            System.out.println("\n\t����� do �� ����  j=" + j);
            j++;
        } while (j < 1);

        System.out.println("==================");

        // while ���� �̿��Ͽ� 5���� ����ϴ� ���α׷�
        int k = 1;
        while (k < 10) {
            System.out.println("5 * " + k + "=" + 5 * k);
            k++;
        }
    }
}
