package day02;

// continue : continue 이후의 문장 실행중단하고 반복문 처음으로 간다.
// continue 문을 이용해서 짝수만 더하기
// 콘솔창 값입력
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
        System.out.println("0 ~ " + inputData + " 까지의 짝수의 합은 : " + sum);
    }
}