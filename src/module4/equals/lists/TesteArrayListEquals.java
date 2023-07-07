package module4.equals.lists;

import java.util.ArrayList;

public class TesteArrayListEquals {

    /*
    * Essa aula exemplifica o uso do metodo contains();.
    * O método contains() internamente usa o método equals() para verificar se o conteúdo dentro de um objeto já existe na lista.
    * O método equals() é sobrescrito para fazer sentido a nossa lógica de negócio e verificar se duas contas já possuem dados iguals.
    * */

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

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
