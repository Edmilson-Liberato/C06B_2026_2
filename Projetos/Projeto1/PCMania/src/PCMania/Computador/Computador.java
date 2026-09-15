package Computador;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoriaUSB;
    private SistemaOperacional sistemaOperacional;

    public Computador(String marca, float preco, HardwareBasico[] hardwares, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.sistemaOperacional = sistemaOperacional;
    }

    public float getPreco() {
        return preco;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {

        this.memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Configuração:");
        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] != null) {
                String unidade = hardwares[i].getNome().toLowerCase().contains("processador") ? "Mhz" : "GB";
                System.out.println(hardwares[i].getNome() + ": " + hardwares[i].getCapacidade() + " "+ unidade);
            }
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " " + sistemaOperacional.getTipo() + " (bits)");
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.getNome() + "  " + memoriaUSB.getCapacidade() + " GB");
        } else {
            System.out.println("Memória USB: nenhuma");
        }
    }
}