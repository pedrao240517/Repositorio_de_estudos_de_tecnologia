package NivelIntermediario.Desafios.Desafio01;

import java.util.Scanner;

public class Desafio01pior {
    static void main() {
        // Desafio com mais dificuldade

        //Criar Scanner
        Scanner scaneio = new Scanner(System.in);

        //array
        int ninjasMaximo = 100;
        String[] ninja = new String[ninjasMaximo];
        int[] ninja2 = new int[ninjasMaximo];

        // contadores
        int escolha = 0;
        int ninjasCadastradados = 0;
        int cadastroQuantidade = 0;
        //outros


        while (escolha != 4) {  // repetição até o usuário desejar sair

            // Menu interativo
            System.out.println("Menu Ninja 2.0");
            System.out.println("===============");
            System.out.println("1-Cadastrar novo ninja: ");
            System.out.println("2-Exibir informações de todos os ninjas: ");
            System.out.println("3-Atualizar habilidades especiais:  ");
            System.out.println("4-Sair do programa");
            System.out.println("Escolha uma opção: ");
            escolha = scaneio.nextInt();
            scaneio.nextLine();

            switch (escolha) {
                case 1:
                    if (ninjasCadastradados < ninjasMaximo) {  // se tiver espaço pra cadastrar ninja vai cadastrar se não não vai
                        // informações do ninja
                        System.out.println("Coloque as informações o seu ninja ");
                        Ninja infomacoes = new Ninja();
                        infomacoes.mostrarInfomacoes2();
                        ninja[ninjasCadastradados] = infomacoes.toString();
                        ninjasCadastradados = ninjasCadastradados + 1;
                        System.out.println("Ninja cadastrado,com sucesso");
                    } else {
                        System.out.println("Limite de ninjas atingido");
                    }
                    break;
                case 2:
                    if (ninjasCadastradados == 0) {
                        System.out.println("nenhum ninja foi cadastrado");
                    } else {
                        System.out.println("======== Lista de Ninjas =========");
                        System.out.println(ninja[ninjasCadastradados]);
                    }




                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. ");
                    break;


            }


        }
    }
}
