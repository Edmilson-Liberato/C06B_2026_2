public class Main {
    public static void main (String[] args){

        ZumbiZ Z = new ZumbiZ();

        Z.quantidade = 100;
        Z.tipo = "Guerra mundial Z";

        Z.ataque();
        System.out.println("A quantidade de Zumbis são " + Z.quantidade + " e são implacaveis do tipo " + Z.tipo);


    }

}
