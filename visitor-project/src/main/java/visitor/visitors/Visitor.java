package visitor.visitors;

import visitor.elements.Book;
import visitor.elements.Electronic;

public interface Visitor {
    void visit(Book book);
    void visit(Electronic electronic);
}
