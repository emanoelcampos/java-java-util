package module3.arrayslist.generics.pt1;

public class TestaGuardador {

    public static void main(String[] args) {

        GuardadorDeString guardadorDeString = new GuardadorDeString();

        String nome = new String("emanoel");
        guardadorDeString.adiciona(nome);

        String sobrenome = new String("campos");
        guardadorDeString.adiciona(sobrenome);

        int tamanho = guardadorDeString.getQuantidadeDeElementos();
        System.out.println(tamanho);

        String ref = guardadorDeString.getReferencia(0);
        String ref2 = guardadorDeString.getReferencia(1);

        System.out.println(ref.length());
        System.out.println(ref2.toUpperCase());
    }
}
