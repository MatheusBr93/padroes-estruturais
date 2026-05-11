package facade.app;

import facade.facade.HomeTheaterFacade;

public class Main {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("Interestelar");

        System.out.println();

        homeTheater.endMovie();
    }
}
