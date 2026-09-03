import java.util.Scanner;

public class Estudante {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a nota1: ");
        double nota1 = entrada.nextInt();
        System.out.println("Entre com a nota2: ");
        double nota2 = entrada.nextInt();

        double NPA = nota1 + nota2;
        double media = NPA/2;

        if (media < NPA) {
            System.out.println("Ficou de NP3");
        }

        System.out.println("Informe o valor da NP3: ");
        double NP3 = entrada.nextInt();

        double NFA = NP3 + NPA;

        if (NFA>=50 ) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");

        }
    }
}

