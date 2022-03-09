package com.bitcamp.web.java.prob;

import java.util.List;
import java.util.Vector;

public class Prob29 {

    //M
    // bookData�� �޾� Book �ν��Ͻ� �����ϰ� �����ϴ� �޼���

    // 1. �Է¹��� ���ڿ��� �Ľ��Ѵ�.
    // 2. Book2 �ν��Ͻ� ���� ��, ���°��� �ִ´�.
    // 3. �ν��Ͻ��� �����Ѵ�.
    private static Book2 makeBook(String bookData) {

        String[] parsingStr = bookData.split(" : ");

        // RuntimeException :
        // ����ó���� �������� �ʴ´�.
        if (parsingStr.length != 3) {
            throw new DataFormatException(parsingStr[0] + "å ������ ��ȯ�� �� ���� ������ �����Դϴ�.");
        }

        Book2 book2 = new Book2();

        book2.setTitle(parsingStr[0]);
        book2.setKind(parsingStr[1]);
        book2.setRentalPrice(Integer.parseInt(parsingStr[2]));

        return book2;
    }

    // Vector�� �޾� Book2 �� �ν��Ͻ��� ����ϴ� �޼���
    private static void printBookList(List<Book2> bookList) {
        for (Book2 book : bookList) {
            System.out.println(book.toString());
        }
    }


    //Main
    public static void main(String[] args) {

        List<Book2> bookList = new Vector<>();

        try {
            bookList.add(makeBook("Java Programming ���� : ��ǻ�� : 35000"));
            bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� : 28000"));
            bookList.add(makeBook("HTML5 API �Ұ� : ��ǻ�� : 58000"));
            //Case 1
            bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� : 45000"));
            //Case 2
//            bookList.add(makeBook("JDBC Programming ���� : ��ǻ��"));
            bookList.add(makeBook("JSP Programming ��� : ��ǻ�� : 56000"));

            System.out.println("<<å ���>>");
            printBookList(bookList);

        } catch (DataFormatException e) {
            System.out.println(e.getMessage());
        }


    }//end of main

}//end of class
