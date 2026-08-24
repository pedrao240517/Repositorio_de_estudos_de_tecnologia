package exercicioNoCodigoJava.condicionais;

import java.util.Scanner;

public class elseif {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===============Sistema de notas===========");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua nota: ");
        int nota = sc.nextInt();
        sc.close();
        if (nota >= 7 ){
            System.out.println(nome +" foi aprovado.");
        }else {
            if (nota >=5){
                System.out.println(nome + " está de recuperação." );
            }else {
                if (nota < 5 ){
                    System.out.println(nome +" está reprovado, é um betinha ");
                }
            }
        }



    }
}
