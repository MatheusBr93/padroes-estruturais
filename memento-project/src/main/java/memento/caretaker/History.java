package memento.caretaker;

import memento.memento.EditorMemento;
import java.util.Stack;

public class History {

    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        if (history.isEmpty()) {
            throw new IllegalStateException("Não há estados salvos para restaurar.");
        }

        return history.pop();
    }
}
