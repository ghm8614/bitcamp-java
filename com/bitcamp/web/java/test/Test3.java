package day01.test;

public class Test3 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // num1
        if (num1 % 2 == 0) {
            System.out.printf((num1 % 3 == 0) ? "%d: 짝수이며 3의 배수이다.\n" : "%d: 짝수이며 3의 배수가 아니다.\n", num1);
        } else {
            System.out.printf((num1 % 3 == 0) ? "%d: 홀수이며 3의 배수이다.\n" : "%d: 홀수이며 3의 배수가 아니다.\n", num1);
        }

        // num2
        if (num2 % 2 == 0) {
            System.out.printf((num2 % 3 == 0) ? "%d: 짝수이며 3의 배수이다.\n" : "%d: 짝수이며 3의 배수가 아니다.\n", num2);
        } else {
            System.out.printf((num2 % 3 == 0) ? "%d: 홀수이며 3의 배수이다.\n" : "%d: 홀수이며 3의 배수가 아니다.\n", num2);
        }

        // 반복문 사용
		/*
		int[] intArray = new int[]{num1,num2};

		for (int i = 0; i<intArray.length ; i++)
		{
			if(intArray[i] % 2 == 0){
				System.out.printf((intArray[i]%3==0)?"%d: 짝수이며 3의 배수이다.\n":"%d: 짝수이며 3의 배수가 아니다.\n",intArray[i]);
			}else{
				System.out.printf((intArray[i]%3==0)?"%d: 홀수이며 3의 배수이다.\n":"%d: 홀수이며 3의 배수가 아니다.\n",intArray[i]);
			}
		}*/
    }
}