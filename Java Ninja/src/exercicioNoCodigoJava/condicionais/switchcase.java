package exercicioNoCodigoJava.condicionais;

import java.util.Scanner;

public class switchcase {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("==========JOGO DA LOUCURA=============");
        System.out.println("Escolha 1 para o modo fácil");
        System.out.println("Escolha 2 para o modo medio");
        System.out.println("Escolha 3 para o modo difícil");
        System.out.println("Escolha 4 para sair do jogo");
        System.out.println("=======================================");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Modo fácil pra betinhas ativados ");
                break;
            case 2:
                System.out.println("iniciantes em farmar aura  no modo médio ativado");
                break;
            case 3:
                System.out.println("Experientes no modo dificil da mogação ultra master plus chad aura 99999+ e 99999+ de ego");
                break;
            case 4:
            System.out.println("Adeus meu patinho, até a proxima.");
                break;
            default:
                System.out.println("Seu QI é 83, pedi pra escolher de 1 a 4 animal");
                break;


        }



    }
}
