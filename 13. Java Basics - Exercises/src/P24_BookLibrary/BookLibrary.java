package P24_BookLibrary;

import java.util.List;

/**
 * Created by todor on 13.08.2017 г..
 */
public class BookLibrary{
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public double getAvergaePriceByAuthor(String author){
        return this.books.stream()
                .filter(b -> b.getAuthorName().equals(author))
                .mapToDouble(b -> b.getPrice())
                .sum();
    }
}