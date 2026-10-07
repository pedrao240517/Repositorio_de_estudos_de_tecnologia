package exercicioNoCodigoJava.iniciante.metodoseOperacoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class metodoseOperacoesMatematicos {
    static void main(String[] args) {

        int escolha;

        System.out.println("-----------------CALCULADORA NUMEROS INTEIROS---------------------");
        System.out.println("1-soma");
        System.out.println("2- subtração");
        System.out.println("3-Multiplicacao");
        System.out.println("4-Divisão");
        System.out.println("Escolha a operação");
        Scanner input = new Scanner(System.in);
        input.nextInt();
        escolha = input.nextInt();

        while (escolha != 5){
            int numero1;
            int numero2;
            int resultado;
            switch (escolha){
                case 1:
                    System.out.println("Digite o primeiro número");
                    numero1 = input.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = input.nextInt();
                     resultado= numero1 + numero2;
                    break;
                case 2:
                    System.out.println("Digite o primeiro número");
                    numero1 = input.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = input.nextInt();
                    resultado= numero1 - numero2;
                    break;
                case 3:
                    System.out.println("Digite o primeiro número");
                    numero1 = input.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = input.nextInt();
                    resultado= numero1 * numero2;
                    break;
                case 4:
                    System.out.println("Digite o primeiro número");
                    numero1 = input.nextInt();
                    System.out.println("Digite o segundo número");
                    numero2 = input.nextInt();
                    resultado= numero1 / numero2;
                    break;
                case 5:
                    System.out.println("Saindo do programa ");
                default:
                    System.out.println("número inválido");
                    break;
            }
        }
        input.close();



    }
}
