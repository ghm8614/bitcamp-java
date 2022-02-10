package day02.test;

class Example3 {
    public static void main(String[] args) {

        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);

        int sum = 0;

        if (firstNum == secondNum) {
            System.out.println("입력값이 같습니다.");
        }
        // 증가식
        else if (firstNum < secondNum) {
            for (int i = firstNum; i <= secondNum; i++) {
                sum += i;
            }
            System.out.printf("%d ~ %d의 합은 %d입니다.", firstNum, secondNum, sum);
        }
        // 증감식
        else {
            for (int i = firstNum; i >= secondNum; i--) {
                sum += i;
            }
            System.out.printf("%d ~ %d의 합은 %d입니다.", secondNum, firstNum, sum);
        }
    }
}
