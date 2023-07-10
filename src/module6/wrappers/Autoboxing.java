package module6.wrappers;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 26; //Integer
        Integer idadeReferencia = new Integer(26);
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing
    }
}
