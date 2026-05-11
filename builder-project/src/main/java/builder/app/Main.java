package builder.app;

import builder.model.Computer;

public class Main {

    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder()
                .processor("Intel Core i3")
                .ram(8)
                .storage(256)
                .operatingSystem("Windows 11")
                .build();

        Computer gamerComputer = new Computer.Builder()
                .processor("Intel Core i7")
                .ram(32)
                .storage(1000)
                .videoCard("NVIDIA RTX 4060")
                .operatingSystem("Windows 11")
                .build();

        System.out.println("Computador básico:");
        System.out.println(basicComputer);

        System.out.println();

        System.out.println("Computador gamer:");
        System.out.println(gamerComputer);
    }
}
