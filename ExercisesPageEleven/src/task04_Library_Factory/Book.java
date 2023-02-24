package task04_Library_Factory;

import java.util.Objects;

public final class Book {
    private final String name;
    private final String author;
    private final BookType booktype;

    private final int ibsnNumber;

    private final Bookmark bookmark;

    public Book(String name, String author, BookType booktype, int ibsnNumber, Bookmark bookmark) {
        Bookmark copiedBookmark = new Bookmark(bookmark.quote);
        this.bookmark = copiedBookmark;
        this.name = name;
        this.author = author;
        this.booktype = booktype;
        this.ibsnNumber = ibsnNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public BookType getBooktype() {
        return booktype;
    }

    public int getIbsnNumber() {
        return ibsnNumber;
    }

    public Bookmark getBookmark() {
        Bookmark copiedBookmark = new Bookmark(bookmark.quote);
        return copiedBookmark;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", booktype=" + booktype +
                ", ibsnNumber=" + ibsnNumber +
                ", bookmark=" + bookmark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ibsnNumber == book.ibsnNumber && Objects.equals(name, book.name) && Objects.equals(author, book.author) && booktype == book.booktype && Objects.equals(bookmark, book.bookmark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, booktype, ibsnNumber, bookmark);
    }
}
