package proxy.real;

import proxy.subject.Document;

public class RealDocument implements Document {

    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Carregando documento real: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Exibindo documento: " + fileName);
    }
}
