package facade.subsystems;

public class DVDPlayer {

    public void on() {
        System.out.println("DVD Player ligado.");
    }

    public void playMovie(String movie) {
        System.out.println("Reproduzindo filme: " + movie);
    }

    public void off() {
        System.out.println("DVD Player desligado.");
    }
}
