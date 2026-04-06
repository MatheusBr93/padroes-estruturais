package app;

import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Sistema iniciado com sucesso.");
        logger2.log("Processando dados do usuário.");

        if (logger1 == logger2) {
            System.out.println("Existe apenas uma instância de Logger.");
        } else {
            System.out.println("Há mais de uma instância de Logger.");
        }
    }
}
