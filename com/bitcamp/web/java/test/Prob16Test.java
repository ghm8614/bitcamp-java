package com.bitcamp.web.java.test;

public class Prob16Test {

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

    //Main
    public static void main(String[] args) {

        String sourceString = "everyday we have is one more than we deserve";
        String encodedString = "";

        for (int i = 0; i < sourceString.length(); i++) {
            System.out.print((char)(sourceString.charAt(i)+3));
        }

//        // ȣ��
//        encodedString = encrypt(sourceString, encodedString);
//
//        // ���
//        System.out.println("��ȣȭ �� ���ڿ� : " + sourceString);
//        System.out.println("��ȣȭ �� ���ڿ� : " + encodedString);

    }
}
