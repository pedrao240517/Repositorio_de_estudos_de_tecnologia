package NivelIntermediario.Desafios.Desafio03;

import java.util.Scanner;

public class Ninja {
    // Definido atributos
    Scanner scaneio2 = new Scanner(System.in);
    int idade;
    String nome;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public void mostrarInfomacoes(){   // Criando o método procedimento
            System.out.println("Meu nome é " + nome+ " tenho "+ idade +" anos");
            System.out.println("Minha missão é "+missao+"de nivel "+ nivelDeDificuldade+ " e foi"+statusDaMissao);

        }
     public void mostrarInfomacoes2(){
         System.out.println("Escreva o nome do ninja: ");
         String nome = scaneio2.nextLine();
         System.out.println("Escreva sua missao: ");
         String missao = scaneio2.nextLine();
         System.out.println("Escreva o nível da missao: ");
         String nivelDeDificuldade = scaneio2.nextLine();
         System.out.println("Escreva o staus da  missao: ");
         String statusDaMissao = scaneio2.nextLine();
         System.out.println("=================================");



     }


    /*
    *Crie u Programa em java para gerenciar informações de ninjas utilizando herança. Desanvolva uma classe chamada Ninja e uma subclasse chamada Uchiha
     */

}
