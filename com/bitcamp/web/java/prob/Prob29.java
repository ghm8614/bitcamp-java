package com.bitcamp.web.java.prob;

import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class Prob29 {

    //M
    // bookData를 받아 Book 인스턴스 생성하고 리턴하는 메서드

    // 1. 입력받은 문자열 파싱하기 (":")
    // 2. Book2 인스턴스의 상태값을 넣는다.
    // 3. 인스턴스를 리턴한다.
    private static Book2 makeBook(String bookData) {

        String[] parsingData = bookData.split(" : ");

        if (parsingData.length != 3) {
            throw new DataFormatException(parsingData[0] + "책 정보는 변환할 수 없는 데이터 포맷입니다.");
        }

        Book2 book2 = new Book2();

        book2.setTitle(parsingData[0]);
        book2.setKind(parsingData[1]);
        book2.setRentalPrice(Integer.parseInt(parsingData[2]));

        return book2;
    }

    // Vector를 받아 Book의 목록을 출력하는 메서드
    private static void printBookList(List<Book2> bookList) {
        for (Book2 book : bookList) {
            System.out.println(book.toString());
        }
    }


    //Main
    public static void main(String[] args) {

        List<Book2> bookList = new Vector<>();

        try {
            bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
            bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
            bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));
            //Case 1
            bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
            //Case 2
//            bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
            bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 : 56000"));

            System.out.println("<<책 목록>>");
            printBookList(bookList);

        } catch (DataFormatException e) {
            System.out.println(e.getMessage());
        }


    }//end of main

}//end of class
