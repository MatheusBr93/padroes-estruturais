package memento.app;

import memento.caretaker.History;
import memento.originator.TextEditor;

public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Primeira versão do texto.");
        history.save(editor.save());
        editor.showContent();

        editor.write(" Segunda versão com alterações.");
        history.save(editor.save());
        editor.showContent();

        editor.write(" Terceira versão com mais mudanças.");
        editor.showContent();

        System.out.println();
        System.out.println("Desfazendo última alteração...");
        editor.restore(history.undo());
        editor.showContent();

        System.out.println();
        System.out.println("Desfazendo novamente...");
        editor.restore(history.undo());
        editor.showContent();
    }
}
