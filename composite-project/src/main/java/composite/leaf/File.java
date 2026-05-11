package composite.leaf;

import composite.component.FileSystemComponent;

public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Arquivo: " + name);
    }
}
