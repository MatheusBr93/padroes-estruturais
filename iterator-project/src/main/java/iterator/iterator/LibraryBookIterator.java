package iterator.iterator;

import iterator.model.Book;
import java.util.List;

public class LibraryBookIterator implements BookIterator {

    private List<Book> books;
    private int position = 0;

    public LibraryBookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new IllegalStateException("Não há mais livros na coleção.");
        }

        return books.get(position++);
    }
}
