package module7.list.ordering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteComparator {

    public static void main(String[] args) {

        String nome = new String("emanoel");
        String segundoNome = new String("campos");
        String ultimoNome = new String("viana");

        List<String> lista = new ArrayList<>();
        lista.add(nome);
        lista.add(segundoNome);
        lista.add(ultimoNome);

        for(String nomes : lista){
            System.out.print(nomes + " ");
        }

        System.out.println();

        NumeroDeCaracteresComparator numeroDeCaracteresComparator = new NumeroDeCaracteresComparator();

        lista.sort(numeroDeCaracteresComparator);

        for(String nomes : lista){
            System.out.print(nomes+ " ");
        }
    }
}

class NumeroDeCaracteresComparator implements Comparator<String> {

    @Override
    public int compare(String nome1, String nome2) {
        if(nome1.length() < nome2.length()) {
            return -1;
        }

        if(nome1.length() > nome2.length()) {
            return 1;
        }
        return 0;
    }
}
