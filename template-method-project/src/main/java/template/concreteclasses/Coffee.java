package template.concreteclasses;

import template.abstractclass.Beverage;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Passando o café...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adicionando açúcar e leite...");
    }
}
