package visitor.visitors;

import visitor.elements.Book;
import visitor.elements.Electronic;

public class DiscountVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        double discountPrice = book.getPrice() * 0.90;

        System.out.println(
            "Livro: " + book.getTitle() +
            " | Preço original: R$ " + book.getPrice() +
            " | Preço com desconto: R$ " + discountPrice
        );
    }

    @Override
    public void visit(Electronic electronic) {
        double discountPrice = electronic.getPrice() * 0.80;

        System.out.println(
            "Eletrônico: " + electronic.getName() +
            " | Preço original: R$ " + electronic.getPrice() +
            " | Preço com desconto: R$ " + discountPrice
        );
    }
}
