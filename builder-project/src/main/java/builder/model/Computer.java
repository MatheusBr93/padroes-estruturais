package builder.model;

public class Computer {

    private String processor;
    private int ram;
    private int storage;
    private String videoCard;
    private String operatingSystem;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.videoCard = builder.videoCard;
        this.operatingSystem = builder.operatingSystem;
    }

    @Override
    public String toString() {
        return "Computador {" +
                "processador='" + processor + '\'' +
                ", ram=" + ram + "GB" +
                ", armazenamento=" + storage + "GB" +
                ", placaDeVideo='" + videoCard + '\'' +
                ", sistemaOperacional='" + operatingSystem + '\'' +
                '}';
    }

    public static class Builder {

        private String processor;
        private int ram;
        private int storage;
        private String videoCard;
        private String operatingSystem;

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder videoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
