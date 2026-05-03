package observer.app;

import observer.subject.WeatherStation;
import observer.observers.PhoneDisplay;
import observer.observers.TVDisplay;

public class Main {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        PhoneDisplay phone = new PhoneDisplay();
        TVDisplay tv = new TVDisplay();

        station.addObserver(phone);
        station.addObserver(tv);

        System.out.println("Atualizando temperatura para 25...");
        station.setTemperature(25);

        System.out.println("Atualizando temperatura para 30...");
        station.setTemperature(30);
    }
}
