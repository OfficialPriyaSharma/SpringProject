package org.example;

public class Book {

    int bookId;
    int bookPrice;
    String bookName;

    Author auth;

    public  Book(){

    }

    public Book(int bookId, int bookPrice, String bookName, Author auth) {
        this.bookId = bookId;
        this.bookPrice = bookPrice;
        this.bookName = bookName;
        this.auth = auth;
    }

    public void display() {

        System.out.println("Book display method");
    }



    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuth() {
        return auth;
    }

    public void setAuth(Author auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookPrice=" + bookPrice +
                ", bookName='" + bookName + '\'' +
                ", auth=" + auth +
                '}';
    }


}
