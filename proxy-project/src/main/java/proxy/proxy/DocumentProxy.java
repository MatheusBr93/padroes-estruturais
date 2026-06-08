package proxy.proxy;

import proxy.real.RealDocument;
import proxy.subject.Document;

public class DocumentProxy implements Document {

    private String fileName;
    private String userRole;
    private RealDocument realDocument;

    public DocumentProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if (!userRole.equalsIgnoreCase("ADMIN")) {
            System.out.println("Acesso negado ao documento: " + fileName);
            return;
        }

        if (realDocument == null) {
            realDocument = new RealDocument(fileName);
        }

        realDocument.display();
    }
}
