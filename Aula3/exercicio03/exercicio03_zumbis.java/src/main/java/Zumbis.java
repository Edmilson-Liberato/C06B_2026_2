public class Zumbis {

        String nome;
        double vida;
        double mostraVida(){

            return vida;
        }
        void transfereVida(Zumbis zumbiDestino, double quantia ){
            vida -= quantia;
            zumbiDestino.vida += quantia;
        }
}


