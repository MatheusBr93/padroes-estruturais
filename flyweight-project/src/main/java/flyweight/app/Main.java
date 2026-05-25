package flyweight.app;

import flyweight.context.Tree;
import flyweight.factory.TreeFactory;
import flyweight.flyweights.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Tree> forest = new ArrayList<>();

        TreeType pineType = TreeFactory.getTreeType("Pinheiro", "Verde", "Textura de pinheiro");
        TreeType oakType = TreeFactory.getTreeType("Carvalho", "Verde escuro", "Textura de carvalho");

        forest.add(new Tree(10, 20, pineType));
        forest.add(new Tree(30, 40, pineType));
        forest.add(new Tree(50, 60, oakType));
        forest.add(new Tree(70, 80, oakType));
        forest.add(new Tree(90, 100, pineType));

        System.out.println();
        System.out.println("Desenhando floresta:");

        for (Tree tree : forest) {
            tree.draw();
        }

        System.out.println();
        System.out.println("Total de árvores no mapa: " + forest.size());
        System.out.println("Total de tipos de árvores criados: " + TreeFactory.getTotalTreeTypes());
    }
}
