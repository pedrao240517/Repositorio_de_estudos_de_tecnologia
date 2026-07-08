package NivelIntermediario.Desafios.Desafio03;

import java.util.Scanner;

public class Desafio01  extends Ninja {
    static void main(String[] args) {

        //contadores
        int escolha = 0;
        int isUchiha = 0;
        int countUchiha = 0;
        int numeroNinjasCadastrados = 0;
        int numeroMaxNinjas = 5;

        //Scanner
        Scanner scaneio = new Scanner(System.in);

        //array
        Ninja[] ninjas = new Ninja[numeroMaxNinjas];
        
        while (escolha != 4) {
            System.out.println("========================");
            System.out.println("1- Adicionar novos ninjas ");
            System.out.println("2- Exibir informações de todos os ninjas ");
            System.out.println("3- Atualizar os ataques especias ");
            System.out.println("4- sair do programa");
            System.out.println("========================");
            escolha = scaneio.nextInt();
            scaneio.nextLine();

            switch (escolha) {
                case 1:
                    if (numeroNinjasCadastrados >= ninjas.length) {
                        System.out.println("Limite de ninjas atingido");
                        break;
                    }

                    System.out.println("Você deseja cadastrar um Uchiha?\n" +
                            "1. Sim\n" +
                            "2. Não");
                    isUchiha = scaneio.nextInt();
                    scaneio.nextLine();
                    if (isUchiha==1){
                        Uchiha U= new Uchiha();
                        System.out.println("Digite o nome: ");
                        U.nome = scaneio.nextLine();
                        System.out.println("Digite a idade: ");
                        U.idade =  scaneio.nextInt();
                        scaneio.nextLine();
                        System.out.println("Digite a missao: ");
                        U.missao = scaneio.nextLine();
                        System.out.println("Digite o nivel de dificuldade: ");
                        U.nivelDeDificuldade = scaneio.nextLine();
                        System.out.println("Digite o status da missao: ");
                        U.statusDaMissao = scaneio.nextLine();
                        System.out.println("Digite a habilidade especial: ");
                        U.habilidadeEspecial = scaneio.nextLine();

                        ninjas[numeroNinjasCadastrados] = U;
                        numeroNinjasCadastrados++;
                        countUchiha++;
                    }
                    System.out.println("Programa finalizado");
                    break;
                case 2:
                    if (numeroNinjasCadastrados == 0) {
                        System.out.println("Ainda não foi cadastrado nenhum ninja!");
                    } else {
                        System.out.println("===== Lista de Ninjas =====");
                        for (int i = 0; i < numeroNinjasCadastrados; i++) {
                            ninjas[i].mostrarInfomacoes();
                            System.out.println("\n");
                        }
                    }

                    break;
                case 3:
                    if (countUchiha == 0) {
                        System.out.println("Nenhum ninja com habilidade especial cadastrado!");
                    } else {
                        boolean temUchiha = false;
                        for (int i = 0; i < numeroNinjasCadastrados; i++) {
                            if (ninjas[i] instanceof Uchiha) {
                                temUchiha = true;
                                System.out.println("===== Uchiha Encontrado ====");
                                System.out.println(ninjas[i].nome);
                                Uchiha uchiha = (Uchiha) ninjas[i];
                                System.out.println("Habilidade Atual: " + uchiha.habilidadeEspecial);
                                System.out.println("Descreva uma nova habilidade:");
                                uchiha.habilidadeEspecial = scaneio.nextLine();
                                System.out.println("Habilidade especial alterada!");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida: ");
                    break;


            }

        }
    }
}
            /*
            //Ninja 1
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Ajudar velhinhos a atravessar a aldeia da nuvem ";
        sasuke.nivelDeDificuldade = "C";
        sasuke.statusDaMissao = " concluída";
        sasuke.mostrarInfomacoes();
             */
