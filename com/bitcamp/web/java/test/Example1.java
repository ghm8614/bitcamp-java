package day01.test;

public class Example1 {
    public static void main(String[] args) {

        int score = Integer.parseInt(args[0]);

//        // ���ǿ� ���� ���
//        if (score < 0 || score > 100) {
//            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//        } else {
//            if (score >= 90) {
//                System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
//            } else if (score >= 80) {
//                System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
//            } else if (score >= 70) {
//                System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
//            } else if (score >= 60) {
//                System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
//            } else {
//                System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
//            }

            // switch-case ���
            if (score < 0 || score > 100) {
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            } else {
                switch (score / 10) {
                    case 10:
                    case 9:
                        System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
                        break;
                    case 8:
                        System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
                        break;
                    case 7:
                        System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
                        break;
                    case 6:
                        System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score);
                        break;
                    default:
                        System.out.printf("�Է��Ͻ� �� %d���� ���Դϴ�.", score); // break ��������
                }
            }
        }
    }
