package decorator.app;

import decorator.components.Coffee;
import decorator.components.SimpleCoffee;
import decorator.decorators.ChocolateDecorator;
import decorator.decorators.MilkDecorator;
import decorator.decorators.WhippedCreamDecorator;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        System.out.println("Pedido inicial:");
        System.out.println(coffee.getDescription());
        System.out.println("Valor: R$ " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        coffee = new ChocolateDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        System.out.println();
        System.out.println("Pedido com adicionais:");
        System.out.println(coffee.getDescription());
        System.out.println("Valor: R$ " + coffee.getCost());
    }
}
