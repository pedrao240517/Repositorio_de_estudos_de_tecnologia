package NivelBasico.Condicionais.exercicios;

import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {

        int opcao= 0;
        while (opcao == 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o primeiro valor: ");
            double primeiro = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double segundo = input.nextDouble();
            System.out.println("escolha a operação desejada: 1- soma , 2-subtração, 3- divisão ou 4 multiplicação");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    primeiro = primeiro + segundo;
                    System.out.println("Valor da soma é: " + primeiro);
                    opcao = opcao + 5;
                    break;
                case 2:
                    primeiro = primeiro - segundo;
                    System.out.println("Valor da subtração é: " + primeiro);
                    opcao = opcao + 5;
                    break;
                case 3:
                    primeiro = primeiro / segundo;
                    System.out.println("Valor da divisão é: " + primeiro);
                    opcao = opcao + 5;
                    break;
                case 4:
                    primeiro = primeiro * segundo;
                    System.out.println("Valor da multiplicação é: " + primeiro);
                    opcao = opcao + 5;
                    break;
                default:
                    System.out.println("Por favor escolha novamente");
            }

        }
    }
}
