package net.proselyte.basepatterns.creational.prototype;

public class BookFactory {
    BookCreator book;

    public BookFactory(BookCreator book) {
        this.book = book;
    }

    public void setBook(BookCreator book) {
        this.book = book;
    }

    BookCreator copyBook() {
        return (BookCreator) book.copy();
    }
}
