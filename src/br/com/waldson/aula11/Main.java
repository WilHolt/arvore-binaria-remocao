package br.com.waldson.aula11;
import java.lang.*;
import java.lang.module.ModuleFinder;

public class Main {

    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        arvore.insert(new Node(10));
        arvore.insert(11);
        arvore.insert(9);
        arvore.insert(8);
        arvore.insert(16);

//        Node n = arvore.search(80);
//        if (n != null) {
//            System.out.println("Elemento encontrado");
//        } else {
//            System.out.println("Elemento não encontrado");
//        }
        arvore.remove(8);
        arvore.print();
    }
}
