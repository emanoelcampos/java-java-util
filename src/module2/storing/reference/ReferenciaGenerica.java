package module2.storing.reference;

public class ReferenciaGenerica {

    public static void main(String[] args) {

        Object[] nomes = new Object[5]; //objetos

        String primeiroNome = new String("emanoel");
        nomes[0] = primeiroNome;

        StringBuilder segundoNome = new StringBuilder("campos");
        nomes[1] = segundoNome;

        System.out.println(nomes[0] + " " + nomes[1]);
    }
}
