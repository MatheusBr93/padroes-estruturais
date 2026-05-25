package prototype.app;

import prototype.model.GameCharacter;

public class Main {

    public static void main(String[] args) {

        GameCharacter originalCharacter =
                new GameCharacter("Arthas", "Guerreiro", 10);

        System.out.println("Personagem original:");
        System.out.println(originalCharacter);

        System.out.println();

        GameCharacter clonedCharacter = originalCharacter.clone();

        clonedCharacter.setName("Arthas Clone");
        clonedCharacter.setLevel(20);

        System.out.println("Personagem clonado:");
        System.out.println(clonedCharacter);

        System.out.println();

        System.out.println("Original após clonagem:");
        System.out.println(originalCharacter);
    }
}
