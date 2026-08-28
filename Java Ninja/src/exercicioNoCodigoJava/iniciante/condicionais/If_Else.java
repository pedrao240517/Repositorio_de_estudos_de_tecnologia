package exercicioNoCodigoJava.iniciante.condicionais;

import java.util.Scanner;

public class If_Else {
    static void main(String[] args) {

        // scaner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        sc.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.close();

        if (idade >= 18){
            System.out.println("Acesso permitido");
        }else {
            System.out.println("Acesso Negado");
            System.out.println("Vaza seu bosta");
        }
        System.out.println("Fim da verificação, adeus pequeno gafanhoto");


    }
}
