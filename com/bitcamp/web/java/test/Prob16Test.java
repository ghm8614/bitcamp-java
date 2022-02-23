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
                    //newChar = ' '; 생략가능
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

//        // 호출
//        encodedString = encrypt(sourceString, encodedString);
//
//        // 출력
//        System.out.println("암호화 전 문자열 : " + sourceString);
//        System.out.println("암호화 후 문자열 : " + encodedString);

    }
}
