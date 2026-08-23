package exercicioNoCodigoJava.sintaxebasica;

import java.util.Scanner;

public class calculadoraDeSomaRapida {
    static void main(String[] args) {

        System.out.println("==================Calculadora silmples=================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        long numero = sc.nextInt();
        System.out.println("Digite outro numero: ");
        long numero2 = sc.nextInt();
        long resultado = numero + numero2;
        System.out.println("A soma desses dois números é: "+ resultado);
        sc.close();











    }
}
