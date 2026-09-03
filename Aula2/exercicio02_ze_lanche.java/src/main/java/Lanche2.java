import java.util.Scanner;

public class Lanche2 {

    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número de lanches consumidos 1: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Entre com o número de lanches consumidos 2:  ");
        int lanche2 = entrada.nextInt();
        System.out.println("Entre com o número de lanches consumidos 3: ");
        int lanche3 = entrada.nextInt();
        int soma = lanche1 + lanche2 + lanche3;
        double media = (double) soma / 3; //(double) pra fazer o casting. Se não quiser fazer o casting pode colocar o número divisor com ponto -> 3.0
        System.out.println("A média é:" + (media));
    }
}
