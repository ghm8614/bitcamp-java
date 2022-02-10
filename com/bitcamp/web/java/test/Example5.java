package day02.test;

// 2차 배열
class Example5 {
    public static void main(String[] args) {

        String[][] text = new String[9][9];

        for (int i = 0; i < text.length; i++) {
            System.out.printf("%d단을 출력합니다.\n", i + 1);
            for (int j = 0; j < text[i].length; j++) {
                text[i][j] = (i + 1) + "*" + (j + 1) + "=" + (i + 1) * (j + 1);
                System.out.printf("text[%d][%d]:" + text[i][j], i, j);
                System.out.println();
            }
        }
    }
}
