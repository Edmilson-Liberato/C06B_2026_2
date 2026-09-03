import java.util.Scanner;

public class SalaAula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos (10, 20 ou 30): ");

        int numAlunos = entrada.nextInt();

        switch (numAlunos) {

            case 10:
            case 20:
                System.out.println("Pode ser utilizada a sala I-16");
                break;

            case 30:
                System.out.println("Pode ser utilizada a sala I-22");
                break;

            default:
                System.out.println("Número de alunos inválido. Informe 10, 20 ou 30.");
                break;
        }

        entrada.close();
    }
}