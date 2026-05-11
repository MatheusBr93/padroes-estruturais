package template.concreteclasses;

import template.abstractclass.Beverage;

public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Preparando o chá...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adicionando limão...");
    }
}
