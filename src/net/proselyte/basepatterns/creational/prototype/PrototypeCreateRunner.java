package net.proselyte.basepatterns.creational.prototype;

public class PrototypeCreateRunner {
    public static void main(String[] args) {
        BookCreator master = new BookCreator(1, "Harry Potter", "J.K. Rowling");

        System.out.println(master);

        BookFactory bookFactory = new BookFactory(master);

        BookCreator masterClone = bookFactory.copyBook();
        System.out.println(masterClone);
    }
}
