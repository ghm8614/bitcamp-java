package day01.test;

public class Test3 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // num1
        if (num1 % 2 == 0) {
            System.out.printf((num1 % 3 == 0) ? "%d: ¦���̸� 3�� ����̴�.\n" : "%d: ¦���̸� 3�� ����� �ƴϴ�.\n", num1);
        } else {
            System.out.printf((num1 % 3 == 0) ? "%d: Ȧ���̸� 3�� ����̴�.\n" : "%d: Ȧ���̸� 3�� ����� �ƴϴ�.\n", num1);
        }

        // num2
        if (num2 % 2 == 0) {
            System.out.printf((num2 % 3 == 0) ? "%d: ¦���̸� 3�� ����̴�.\n" : "%d: ¦���̸� 3�� ����� �ƴϴ�.\n", num2);
        } else {
            System.out.printf((num2 % 3 == 0) ? "%d: Ȧ���̸� 3�� ����̴�.\n" : "%d: Ȧ���̸� 3�� ����� �ƴϴ�.\n", num2);
        }

        // �ݺ��� ���
		/*
		int[] intArray = new int[]{num1,num2};

		for (int i = 0; i<intArray.length ; i++)
		{
			if(intArray[i] % 2 == 0){
				System.out.printf((intArray[i]%3==0)?"%d: ¦���̸� 3�� ����̴�.\n":"%d: ¦���̸� 3�� ����� �ƴϴ�.\n",intArray[i]);
			}else{
				System.out.printf((intArray[i]%3==0)?"%d: Ȧ���̸� 3�� ����̴�.\n":"%d: Ȧ���̸� 3�� ����� �ƴϴ�.\n",intArray[i]);
			}
		}*/
    }
}