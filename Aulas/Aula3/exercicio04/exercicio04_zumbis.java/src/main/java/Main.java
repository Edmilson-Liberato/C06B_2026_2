public class Main {
    public static void main (String[] args){

        Zumbis Z1 = new Zumbis();
        Zumbis Z2 = new Zumbis();

        Z1.vida = 100;
        Z1.nome = "ZumbiAlvo";
        System.out.println("0 meu nome é: " + Z1.nome + " e tenho: "+ Z1.vida + " de vida");

        Z2.vida = 10;
        Z2.nome = "ZumbiZ";
        System.out.println("0 meu nome é: " + Z2.nome + " e tenho: "+ Z2.vida + " de vida");

        boolean capacidade = Z1.transfereVida(Z2, 50);
        if(capacidade) {
            System.out.println("0 " + Z1.nome + " transferiu 50 de vida para o " + Z2.nome);
        }
        else{
            System.out.println("Zumbi Z1 não tem capacidade de tranferir vida.");
        }
        System.out.println("Vida atual do ZumbiAlvo: " + Z1.mostraVida());
        System.out.println("0 " + Z2.nome + " Agora possui: " + Z2.vida + " de vida");

    }
}



