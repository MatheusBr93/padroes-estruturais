package observer.observers;

public class PhoneDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("Celular: temperatura atual = " + temperature);
    }
}
