package com.bitcamp.web.java.prob;

public class SortUtil {

    //Method
    public int[] ascending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }//end of for
        }//end of for
        return array;
    }


    //Main
    public static void main(String[] args) {

        SortUtil util = new SortUtil();
        int[] intArray = new int[]{7, 5, 2, 19, 32, 51, 32, 11, 67, 21};

        intArray = util.ascending(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);

            if (i != intArray.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("");
            }
        }//end of for

    }
}
