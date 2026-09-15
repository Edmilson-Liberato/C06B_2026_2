import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 10 para adivinhar o numero gerado: ");
        int numero = entrada.nextInt();

        while (x != numero) {
            System.out.println("Numero errado. Digite um número entre 1 a 10 novamente: ");
            numero = entrada.nextInt();
        }
        System.out.println("Numero certo.O numero gerado foi o: " + x);

        entrada.close();

    }

}
