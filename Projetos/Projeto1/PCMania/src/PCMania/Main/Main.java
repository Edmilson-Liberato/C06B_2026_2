package Main;

import Computador.Cliente;
import Computador.Computador;
import Computador.HardwareBasico;
import Computador.MemoriaUSB;
import Computador.SistemaOperacional;
import Pedido.ProcessarPedido;

import java.util.Scanner;
import Computador.Cliente;
import Computador.HardwareBasico;
import Computador.Computador;
import Computador.MemoriaUSB;
import Computador.SistemaOperacional;
import Pedido.ProcessarPedido;

/*
Nome: Edmílson Lopes Liberato
Mátricula: 688
Curso: GES
*/

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        //Criando os objetos das classes
        HardwareBasico[] hardwarePromocao1 = new HardwareBasico[3];
        hardwarePromocao1[0] = new HardwareBasico("Processador Core i5", 2200);
        hardwarePromocao1[1] = new HardwareBasico("Memória RAM", 8);
        hardwarePromocao1[2] = new HardwareBasico("HD", 500);

        HardwareBasico[] hardwarePromocao2 = new HardwareBasico[3];
        hardwarePromocao2[0] = new HardwareBasico("Processador Core i7", 3370);
        hardwarePromocao2[1] = new HardwareBasico("Memória RAM", 16);
        hardwarePromocao2[2] = new HardwareBasico("HD", 1000);

        HardwareBasico[] hardwarePromocao3 = new HardwareBasico[3];
        hardwarePromocao3[0] = new HardwareBasico("Processador Core i9", 4500);
        hardwarePromocao3[1] = new HardwareBasico("Memória RAM", 32);
        hardwarePromocao3[2] = new HardwareBasico("HD", 2000);

        SistemaOperacional soPromocao1 = new SistemaOperacional("macOS Sequoia", 64);
        SistemaOperacional soPromocao2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional soPromocao3 = new SistemaOperacional("Windows 10", 64);

        MemoriaUSB memoriaPromocao1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB memoriaPromocao2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB memoriaPromocao3 = new MemoriaUSB("HD Externo", 1000);

        Computador computadorPromocao1 = new Computador("Apple", 688, hardwarePromocao1, soPromocao1);
        Computador computadorPromocao2 = new Computador("Samsung", 689, hardwarePromocao2, soPromocao2);
        Computador computadorPromocao3 = new Computador("Dell", 690, hardwarePromocao3, soPromocao3);

        computadorPromocao1.addMemoriaUSB(memoriaPromocao1);
        computadorPromocao2.addMemoriaUSB(memoriaPromocao2);
        computadorPromocao3.addMemoriaUSB(memoriaPromocao3);

        //Interface com o cliente
        System.out.println("Bem vindo a PC Mania!");
        System.out.println("Digite seu nome: ");
        String nomeCliente = entrada.next();
        System.out.println("Digite seu CPF: ");
        String cpfCliente = entrada.next();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        System.out.println("Qual promoção gostaria de comprar? No momento,temos três promoções:");

        Computador[] computadoresComprados = new Computador[100];
        int totalComprados = 0;
        boolean finalizar = false;

        while (!finalizar) {
            System.out.println("Digite 1 para comprar PC da promoção 1");
            System.out.println("Digite 2 para a PC da promoção 2");
            System.out.println("Digite 3 para comprar PC da promoção 3");
            System.out.println("Digite 0 para finalizar a compra");

            int codigo = entrada.nextInt();

            switch (codigo) {
                case 1:
                    if (totalComprados < computadoresComprados.length) {
                        computadoresComprados[totalComprados] = computadorPromocao1;
                        totalComprados++;
                        System.out.println("Promoção 1 adicionado ao pedido.\n");
                    }
                    break;
                case 2:
                    if (totalComprados < computadoresComprados.length) {
                        computadoresComprados[totalComprados] = computadorPromocao2;
                        totalComprados++;
                        System.out.println("Promoção 2 adicionado ao pedido.\n");
                    }
                    break;
                case 3:
                    if (totalComprados < computadoresComprados.length) {
                        computadoresComprados[totalComprados] = computadorPromocao3;
                        totalComprados++;
                        System.out.println("Promoção 3 adicionado ao pedido.\n");
                    }
                    break;
                case 0:
                    finalizar = true;
                    System.out.println("Compra finalizada \n");
                    break;
                default:
                    System.out.println("Código inválido. Digite 1, 2, 3 ou 0.");
                    break;
            }
        }

        System.out.println("Resumo do Pedido");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("CPF: " + cpfCliente);
        for (Computador computador : computadoresComprados) {
            if (computador != null) {
                computador.mostraPCConfigs();
            }
        }

        System.out.println("Valor total da compra: R$ " + cliente.calculaTotalCompra(computadoresComprados));

        ProcessarPedido.enviarPedido(computadoresComprados);

        entrada.close();

    }
}
