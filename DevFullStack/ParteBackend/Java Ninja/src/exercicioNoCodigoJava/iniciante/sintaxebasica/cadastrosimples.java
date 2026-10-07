package exercicioNoCodigoJava.iniciante.sintaxebasica;

import java.util.Scanner;

public class cadastrosimples {
    static void main(String[] args) {

        System.out.println("=============SISTEMA DE CADASTRO==================");

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura(com,): ");
        float altura = sc.nextFloat();
        sc.close();
        System.out.println("Cadastro realizado com sucesso!");




    }
}
