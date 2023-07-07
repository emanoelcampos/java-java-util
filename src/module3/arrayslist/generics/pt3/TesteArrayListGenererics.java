package module3.arrayslist.generics.pt3;

import java.util.ArrayList;

public class TesteArrayListGenererics {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        String nome = new String("emanoel");
        lista.add(nome);

        String sobrenome = new String("campos");
        lista.add(sobrenome);

        System.out.println(lista.size());
        System.out.println(lista.get(1));

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        for (String nomes : lista) {
            System.out.println(nomes);
        }
    }
}
