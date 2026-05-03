package observer.observers;

public class TVDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("TV: temperatura atual = " + temperature);
    }
}
