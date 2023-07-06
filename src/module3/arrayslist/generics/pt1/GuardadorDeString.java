package module3.arrayslist.generics.pt1;

public class GuardadorDeString {

    private String[] nomes;
    private int posicaoLivre;

    public GuardadorDeString() {
        this.nomes = new String[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(String nome) {
        this.nomes[this.posicaoLivre] = nome;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public String getReferencia(int posicao) {
        return this.nomes[posicao];
    }
}
