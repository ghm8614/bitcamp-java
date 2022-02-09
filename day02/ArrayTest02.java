package day02;

// 이차원 배열
class ArrayTest02 {
    public static void main(String[] args) {
        int[][] value = new int[9][9];

        // index를 통해 value에 접근 및 대입
        for (int i = 0; i < 9; i++) {
            value[0][i] = i * (i + 1);
        }

        for (int j = 0; j < value.length; j++) {
            System.out.println("=================");
            for (int k = 0; k < value[j].length; k++) {
                System.out.println("value[" + j + "][" + k + "] = " + value[j][k]);
            }
        }
    }
}
