package net.proselyte.basepatterns.creational.prototype;

public class BookCreator implements Copyable {
    private int id;
    private String name;
    private String author;

    public BookCreator(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Object copy() {
        BookCreator copy = new BookCreator(id, name, author);
        return copy;
    }

    @Override
    public String toString() {
        return "BookCreator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
