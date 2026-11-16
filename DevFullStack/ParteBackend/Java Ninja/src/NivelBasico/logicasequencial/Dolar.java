package NivelBasico.logicasequencial;

import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {

        System.out.println("Valor do dolar em reais: ");
        Scanner sc = new Scanner(System.in);
        double valor  = sc.nextDouble() ;
        System.out.println("Quantos dolares deseja converter: ");
        double quantos = sc.nextDouble();
        double convertidos =  valor * quantos;
        System.out.println("A quantidade de dolares em reais é " +  convertidos);


    }
}
