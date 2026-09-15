public class Zumbis {

    String nome;
    double vida;
    double mostraVida(){

        return vida;
    }
    boolean transfereVida(Zumbis zumbiDestino, double quantia ){

        if(quantia <= vida && quantia > 0) {
            vida -= quantia;
            zumbiDestino.vida += quantia;
            return true;
        }
        else{
            return false;
        }
    }
}
