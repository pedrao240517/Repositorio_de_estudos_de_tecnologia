package NivelBasico.Desafios;

import java.util.Scanner;

public class DESAFIO2 {
    static void main(String[] args) {

        /*
         * objetivo:Criar um sistema simples em java para cadastro de novos ninjas e listar todos os ninjas cadastrados
         * mais dificuldade: permita ao usario quantos ninjas ele quer cadastrar por vez 
         */


        // entrada de dados
            Scanner scaneio = new Scanner (System.in);

        //array
        int numeroMax =10;
        String[] ninja = new String[numeroMax];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;
        int cadastroQuantidade = 0;
        

        // Menu
        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scaneio.nextInt();
            scaneio.nextLine();


            switch (opcao) {
                case 1:  // deve colocar o ninja e usuário deve decidir se deve continuar ou não
                    if (ninjasCadastrados < ninja.length) {   // receber nome do ninja confome a quantidade que o sistema aguenta
                        System.out.println("Quantos ninjas deseja adicionar ");
                        cadastroQuantidade = scaneio.nextInt();
                        scaneio.nextLine();
                        for (int i = 0; i < cadastroQuantidade; i++) {
                        System.out.println("Coloque o nome do seu ninja: ");
                        String nomeNinja = scaneio.nextLine();
                        ninja[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados = ninjasCadastrados + 1; // adiciona o ninja cadastrado mais um pra poder acessar o slot do arraw
                        System.out.println("Ninja cadastrado,com sucesso");}
                    } else {
                        System.out.println("Número máximo de ninjas cadastrados");
                    }
                    break;
                case 2: // Deve aparecer o nome de todos os ninjas
                    if (ninjasCadastrados == 0) {
                        System.out.println("nenhum ninja foi cadastrado");
                    } else {
                        System.out.println("======== Lista de Ninjas =========");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println(ninja[i]);

                        }
                    }

                    break;
                case 3:
                    System.out.println("Fim do Programa ");  // sair do programa
                    break;
                default:
                    System.out.println("Opção inválida.");  // usuario burro
                    break;


            }

        }


    }
}
