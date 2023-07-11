# Classes Anônimas e Lambdas em Java

## Introdução

Neste documento, vamos explorar dois recursos poderosos da linguagem Java: classes anônimas e lambdas. Essas
funcionalidades são amplamente utilizadas para implementar abordagens mais concisas e expressivas ao lidar com
interfaces funcionais.

## Classes Anônimas

Em Java, uma classe anônima é uma forma de criar uma classe sem nome diretamente no local em que ela será usada. Ela é
útil quando precisamos implementar uma interface ou estender uma classe abstrata de forma rápida e sem a necessidade de
criar uma classe separada.

A sintaxe básica para criar uma classe anônima é a seguinte:

```java
interface Exemplo {
    void metodo();
}

public class ClasseExemplo {
    public static void main(String[] args) {
        Exemplo obj = new Exemplo() {
            public void metodo() {
                System.out.println("Implementação do método");
            }
        };
        obj.metodo();
    }
}
```

Nesse exemplo, criamos uma classe anônima que implementa a interface `Exemplo` e define a implementação do método
`metodo()`. Em seguida, criamos um objeto dessa classe e chamamos o método `metodo()`.

As classes anônimas são particularmente úteis quando queremos fornecer uma implementação específica para uma interface
funcional em um contexto específico, sem a necessidade de criar uma classe separada.

## Lambdas
Lambdas são uma forma mais concisa e expressiva de escrever código em Java quando trabalhamos com interfaces funcionais.
Uma interface funcional é aquela que contém apenas um único método abstrato. O uso de lambdas permite escrever o corpo
desse método diretamente, sem precisar criar uma classe anônima.

Aqui está um exemplo básico de como usar lambdas em Java:

```java
interface OperacaoMatematica {
int executar(int a, int b);
}

public class ExemploLambda {
public static void main(String[] args) {
OperacaoMatematica soma = (a, b) -> a + b;
System.out.println(soma.executar(2, 3)); // Saída: 5

        OperacaoMatematica subtracao = (a, b) -> a - b;
        System.out.println(subtracao.executar(5, 2)); // Saída: 3
    }

}
```
Neste exemplo, definimos a interface funcional `OperacaoMatematica`, que possui o método `executar()`. Em seguida, usamos
lambdas para implementar a adição e a subtração. Não precisamos criar classes anônimas; em vez disso, definimos as
implementações diretamente usando a `sintaxe () -> ....`

Lambdas são particularmente úteis quando lidamos com coleções de dados ou quando precisamos passar comportamentos como
argumentos para métodos.

## Conclusão
Classes anônimas e lambdas são recursos poderosos do Java que permitem escrever código mais conciso e expressivo. As
classes anônimas são úteis para fornecer implementações rápidas de interfaces ou extensões de classes abstratas sem a
necessidade de criar classes separadas. Já as lambdas permitem definir implementações de interfaces funcionais
diretamente no local em que são usadas, sem criar classes anônimas.

Ao dominar esses recursos, você poderá escrever código mais limpo e legível em Java, tornando seu trabalho mais
eficiente e produtivo.