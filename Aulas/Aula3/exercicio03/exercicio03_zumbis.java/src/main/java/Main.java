public class Main {

    public static void main(String[] args) {
        Zumbis Z1 = new Zumbis();
        Zumbis Z2 = new Zumbis();

        Z1.vida = 100;
        Z1.nome = "ZumbiAlvo";
        System.out.println("0 meu nome é: " + Z1.nome + " e tenho: "+ Z1.vida + " de vida");

        Z2.vida = 10;
        Z2.nome = "ZumbiZ";
        System.out.println("0 meu nome é: " + Z2.nome + " e tenho: "+ Z2.vida + " de vida");

        Z1.transfereVida(Z2, 50);
        System.out.println("0 " + Z1.nome + " transferiu 50 de vida para o "+ Z2.nome);
        System.out.println("Vida atual do ZumbiAlvo: " + Z1.mostraVida());
        System.out.println("0 " + Z2.nome + " Agora possui: "+ Z2.vida + " de vida");

        Z1 = Z2;
        System.out.println("\nDepois de Z1 = Z2:");

        Z1.vida = 100;

        System.out.println("Vida através de Z1: " + Z1.mostraVida());
        System.out.println("Vida através de Z2: " + Z2.mostraVida());

        Z2.vida = 200;

        System.out.println("Depois de alterar através de Z2:");
        System.out.println("Vida através de Z1: " + Z1.mostraVida());
        System.out.println("Vida através de Z2: " + Z2.mostraVida());

    }
}
