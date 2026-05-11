package facade.subsystems;

public class SoundSystem {

    public void on() {
        System.out.println("Sistema de som ligado.");
    }

    public void setVolume(int volume) {
        System.out.println("Volume ajustado para: " + volume);
    }

    public void off() {
        System.out.println("Sistema de som desligado.");
    }
}
