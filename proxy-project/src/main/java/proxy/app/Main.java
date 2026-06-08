package proxy.app;

import proxy.proxy.DocumentProxy;
import proxy.subject.Document;

public class Main {

    public static void main(String[] args) {

        Document userDocument = new DocumentProxy("relatorio-financeiro.pdf", "USER");
        userDocument.display();

        System.out.println();

        Document adminDocument = new DocumentProxy("relatorio-financeiro.pdf", "ADMIN");
        adminDocument.display();

        System.out.println();

        adminDocument.display();
    }
}
