package task04_Library_Factory;

import java.util.Objects;

public class Bookmark {
    public String quote;

    public Bookmark(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookmark bookmark = (Bookmark) o;
        return Objects.equals(quote, bookmark.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quote);
    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "quote='" + quote + '\'' +
                '}';
    }
}
