package module4.equals.lists;

import java.util.LinkedList;
import java.util.List;

public class TesteLinkedList {

    public static void main(String[] args) {

        List<String> lista = new LinkedList<>();

        String nome = new String("emanoel");
        lista.add(nome);

        String sobrenome = new String("campos");
        lista.add(sobrenome);

        String nomeIgual = new String("emanoel");

        boolean igual = nome.equals(sobrenome);
        System.out.println(igual);

        boolean existe = lista.contains(nomeIgual);
        System.out.println(existe);

        for (String nomes : lista) {
            System.out.println(nomes);
        }
    }
}
