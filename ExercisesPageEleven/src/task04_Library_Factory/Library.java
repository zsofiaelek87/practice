package task04_Library_Factory;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Library {

    private final Set<Book> books;

    public Library(Set<Book> books) {
        Set<Book> copiedBooks = new HashSet<>();
        copiedBooks.addAll(books);
        this.books = copiedBooks;
    }

    public Set<Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
