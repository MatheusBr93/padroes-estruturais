package prototype.model;

public class GameCharacter implements Cloneable {

    private String name;
    private String characterClass;
    private int level;

    public GameCharacter(String name, String characterClass, int level) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public GameCharacter clone() {
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar personagem.");
        }
    }

    @Override
    public String toString() {
        return "Personagem {" +
                "nome='" + name + '\'' +
                ", classe='" + characterClass + '\'' +
                ", nível=" + level +
                '}';
    }
}
