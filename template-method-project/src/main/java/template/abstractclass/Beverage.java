package template.abstractclass;

public abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Fervendo água...");
    }

    private void pourInCup() {
        System.out.println("Servindo na xícara...");
    }

    protected abstract void brew();

    protected abstract void addCondiments();
}
