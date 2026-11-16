package NivelBasico.logicasequencial;

import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {

        System.out.println("Qual o valor do produto? ");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        System.out.println("Qual o desconto do produto?(em decimal) ");
        double desconto = sc.nextDouble();
        double valorDesconto = valor - ((desconto * valor)/100 );
        System.out.println("Valor total: " + valorDesconto);
        sc.close();
    }
}

