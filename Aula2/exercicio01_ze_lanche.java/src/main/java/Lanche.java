import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {

        int lanche1 = 10;
        int lanche2 = 4;
        int lanche3 = 2;

        int soma = lanche1 + lanche2 + lanche3;
        double media = soma/3;

        Scanner valorTeclado = new Scanner(System.in); //Referente a objeto. Fique esperando que digite algo
        int meuInteiro = valorTeclado.nextInt();

        System.out.println( "o numero total de lanches é: " + soma);
        System.out.println( "a media de lanches é: " + media);

    }

}
