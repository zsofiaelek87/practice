package task04_Library_Factory;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Bookmark bookmark = new Bookmark("Ki korán kel");

        Book book1 = new Book("Name1", "Author1", BookType.SCIFI, 123, bookmark);
        Book book2 = new Book("Name2", "Author2", BookType.CHILDREN, 456, bookmark);
        Book book3 = new Book("Name3", "Author3", BookType.COOKING, 789, bookmark);

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library library = new Library(books);

        System.out.println(library);

        Book book4 = new Book("Name4", "Author4", BookType.COOKING, 789, bookmark);

        books.add(book4);

        System.out.println(library);

    }
}
