package module1.arrays;

public class ArrayPrimitivos {

    public static void main(String[] args) {

        int[] numeros; //também pode ser dessa forma: int numeros[];
        String[] nomes = new String[3]; //precisa ser inicializado com um valor

        nomes[0] = "emanoel";
        nomes[1] = "campos";
        nomes[2] = "viana";

        String meuNome = nomes[0];

        System.out.println(meuNome);
        System.out.println(nomes.length);

        for(int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + " ");
        }

    }
}
