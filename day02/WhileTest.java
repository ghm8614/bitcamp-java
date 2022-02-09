package day02;

// while과  do-while문 활용 및 차이알기
class WhileTest {
    public static void main(String[] args) {
        // while 문
        int i = 0;
        while (i < 10) {
            System.out.println("\n\t여기는 while 문 내부  i=" + i);
            i++;
        }

        // while- do 문
        int j = 0;
        do {
            System.out.println("\n\t여기는 do 문 내부  j=" + j);
            j++;
        } while (j < 1);

        System.out.println("==================");

        // while 문을 이용하여 5단을 출력하는 프로그램
        int k = 1;
        while (k < 10) {
            System.out.println("5 * " + k + "=" + 5 * k);
            k++;
        }
    }
}
