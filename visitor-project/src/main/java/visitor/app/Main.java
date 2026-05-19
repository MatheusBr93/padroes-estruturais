package visitor.app;

import visitor.elements.Book;
import visitor.elements.Electronic;
import visitor.elements.Product;
import visitor.visitors.DiscountVisitor;

public class Main {

    public static void main(String[] args) {

        Product book = new Book("Clean Code", 120.00);
        Product electronic = new Electronic("Notebook Gamer", 5000.00);

        DiscountVisitor visitor = new DiscountVisitor();

        book.accept(visitor);
        electronic.accept(visitor);
    }
}
