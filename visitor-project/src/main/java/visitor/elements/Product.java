package visitor.elements;

import visitor.visitors.Visitor;

public interface Product {
    void accept(Visitor visitor);
}
