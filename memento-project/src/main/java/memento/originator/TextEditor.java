package memento.originator;

import memento.memento.EditorMemento;

public class TextEditor {

    private String content = "";

    public void write(String text) {
        content += text;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }

    public void showContent() {
        System.out.println("Conteúdo atual: " + content);
    }
}
