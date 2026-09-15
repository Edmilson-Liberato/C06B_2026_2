package Computador;

public class SistemaOperacional {

    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome(){

        return this.nome;
    }

    public float getTipo() {
        return this.tipo;

    }
}
