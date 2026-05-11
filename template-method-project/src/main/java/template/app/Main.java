package template.app;

import template.abstractclass.Beverage;
import template.concreteclasses.Coffee;
import template.concreteclasses.Tea;

public class Main {

    public static void main(String[] args) {

        System.out.println("Preparando café:");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();

        System.out.println("Preparando chá:");
        Beverage tea = new Tea();
        tea.prepareRecipe();
    }
}
