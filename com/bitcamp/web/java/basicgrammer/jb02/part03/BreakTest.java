package com.bitcamp.web.java.basicgrammer.jb02.part03;

// break : �ڽ��� ���� �ݺ��� ����
class BreakTest {
    public static void main(String[] args) {
        // �ֿܼ��� �Է¹��� ���ڿ� int�� ��ȯ
        int inputData = Integer.parseInt(args[0]);

        int i = 0;
        int sum = 0;
        while (true) {
            i++;
            sum = sum + i;
            if (i == inputData) {
                break;
            }
        }
        System.out.println("0 ~ " + inputData + "������ ���� : " + sum + "�Դϴ�.");
    }
}
