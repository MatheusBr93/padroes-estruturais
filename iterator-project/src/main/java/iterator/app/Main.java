package iterator.app;

import iterator.collection.Library;
import iterator.iterator.BookIterator;
import iterator.model.Book;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.addBook(new Book("Design Patterns", "GoF"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));

        BookIterator iterator = library.createIterator();

        System.out.println("Livros disponíveis na biblioteca:");

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getDetails());
        }
    }
}
