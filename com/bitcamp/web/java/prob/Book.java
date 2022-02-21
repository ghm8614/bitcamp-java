package com.bitcamp.web.java.prob;

public class Book {

    //Field
    private String title;
    private int price;

    //Constructor
    public Book() {
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    //Method
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
