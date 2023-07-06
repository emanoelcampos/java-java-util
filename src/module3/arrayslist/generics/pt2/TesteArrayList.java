package module3.arrayslist.generics.pt2;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        String nome = new String("emanoel");
        lista.add(nome);

        String sobrenome = new String("campos");
        lista.add(sobrenome);

        System.out.println(lista.size());
        System.out.println(lista.get(1));

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        for (Object nomes : lista) {
            System.out.println(nomes);
        }
    }
}
