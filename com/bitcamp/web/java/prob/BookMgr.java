package com.bitcamp.web.java.prob;

public class BookMgr {

    //Field
    Book[] bookList;

    //Constructor
    public BookMgr() {
    }

    public BookMgr(Book[] bookList) {
        this.bookList = bookList;
    }

    //Method
    public void printBookList() {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].getTitle());
        }
    }

    public void printTotalPrice() {
        int total = 0;
        for (int i = 0; i < bookList.length; i++) {
            total += bookList[i].getPrice();
        }
        System.out.print("전체 책 가격의 합 : "+ total);
    }
}
