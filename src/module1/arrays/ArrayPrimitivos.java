package module1.arrays;

public class ArrayPrimitivos {

    public static void main(String[] args) {

        int[] numeros1; //também pode ser dessa forma: int numeros1[];
        int[] numeros = new int[3]; //precisa ser inicializado com um valor

        numeros[0] = 9;
        numeros[1] = 7;
        numeros[2] = 13;

        int meuNumero = numeros[0];

        System.out.println(meuNumero);
        System.out.println(numeros.length);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
