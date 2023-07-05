package module1.arrays;

public class ArrayReferencias {

    public static void main(String[] args) {

        String[] nomes = new String[5]; //objetos

        String primeiroNome = new String("emanoel");
        nomes[0] = primeiroNome;

        String segundoNome = new String("campos");
        nomes[1] = segundoNome;

        System.out.println(nomes[0].toUpperCase() + " " + nomes[1].toUpperCase());
    }
}
