package day02.test;

class Example3 {
    public static void main(String[] args) {

        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);

        int sum = 0;

        if (firstNum == secondNum) {
            System.out.println("�Է°��� �����ϴ�.");
        }
        // ������
        else if (firstNum < secondNum) {
            for (int i = firstNum; i <= secondNum; i++) {
                sum += i;
            }
            System.out.printf("%d ~ %d�� ���� %d�Դϴ�.", firstNum, secondNum, sum);
        }
        // ������
        else {
            for (int i = firstNum; i >= secondNum; i--) {
                sum += i;
            }
            System.out.printf("%d ~ %d�� ���� %d�Դϴ�.", secondNum, firstNum, sum);
        }
    }
}
