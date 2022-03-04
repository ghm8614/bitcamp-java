package com.bitcamp.web.java.prob;

public class Book2 {
    //F
    private String title;
    private String kind;
    private int rentalPrice;

    //C
    public Book2() {

    }

    //M
    //getter/setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    //toString 오버라이딩

    @Override
    public String toString() {
        return "Book2 [title=" + title + ", kind=" + kind + ", rentalPrice=" + rentalPrice + "]";
    }
}
