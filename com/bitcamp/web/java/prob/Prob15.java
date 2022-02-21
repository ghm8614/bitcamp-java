package com.bitcamp.web.java.prob;

public class Prob15 {

    //Method
    private static String encrypt(String sourceString, String encodedString) {

        // ' ' -> ' '
        // 'x' -> 'a', 'y' -> 'b', 'z' -> 'c'
        for (int i = 0; i < sourceString.length(); i++) {

            char newChar = ' ';
            switch (sourceString.charAt(i)) {
                case ' ':
                    //newChar = ' '; ��������
                    break;
                case 'x':
                    newChar = 'a';
                    break;
                case 'y':
                    newChar = 'b';
                    break;
                case 'z':
                    newChar = 'c';
                    break;
                default:
                    newChar = (char) (sourceString.charAt(i) + 3);
            }//end of switch
            encodedString += newChar;

        }//end of for
        return encodedString;
    }
/*
    private static String encrypt2(String sourceString, String encodedString) {

        for (int i = 0; i < sourceString.length(); i++) {

            if (sourceString.charAt(i) == ' ') {
                encodedString += ' ';
            } else if (sourceString.charAt(i) == 'x') {
                encodedString += 'a';
            } else if (sourceString.charAt(i) == 'y') {
                encodedString += 'b';
            } else if (sourceString.charAt(i) == 'z') {
                encodedString += 'c';
            } else {    // ����, x, y, z �� �ƴϸ�
                encodedString += (char) (sourceString.charAt(i) + 3);
            }
        }
        return encodedString;
    }
 */
    //Main
    public static void main(String[] args) {

        String sourceString = "everyday we have is one more than we deserve";
        String encodedString = "";

        // ȣ��
        encodedString = encrypt(sourceString, encodedString);

        // ���
        System.out.println("��ȣȭ �� ���ڿ� : " + sourceString);
        System.out.println("��ȣȭ �� ���ڿ� : " + encodedString);

    }
}
