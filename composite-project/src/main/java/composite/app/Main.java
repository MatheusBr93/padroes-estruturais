package composite.app;

import composite.composite.Folder;
import composite.leaf.File;

public class Main {

    public static void main(String[] args) {

        File file1 = new File("documento.txt");
        File file2 = new File("foto.png");
        File file3 = new File("planilha.xlsx");

        Folder rootFolder = new Folder("Documentos");
        Folder imagesFolder = new Folder("Imagens");

        imagesFolder.add(file2);

        rootFolder.add(file1);
        rootFolder.add(file3);
        rootFolder.add(imagesFolder);

        rootFolder.showDetails();
    }
}
