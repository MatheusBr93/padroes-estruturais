package facade.facade;

import facade.subsystems.DVDPlayer;
import facade.subsystems.Projector;
import facade.subsystems.SoundSystem;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
    }

    public void watchMovie(String movie) {
        System.out.println("Preparando home theater...");

        projector.on();
        soundSystem.on();
        soundSystem.setVolume(20);

        dvdPlayer.on();
        dvdPlayer.playMovie(movie);

        System.out.println("Filme iniciado.");
    }

    public void endMovie() {
        System.out.println("Desligando home theater...");

        dvdPlayer.off();
        soundSystem.off();
        projector.off();

        System.out.println("Home theater desligado.");
    }
}
