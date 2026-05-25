package iterator.collection;

import iterator.iterator.BookIterator;
import iterator.iterator.LibraryBookIterator;
import iterator.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public BookIterator createIterator() {
        return new LibraryBookIterator(books);
    }
}
