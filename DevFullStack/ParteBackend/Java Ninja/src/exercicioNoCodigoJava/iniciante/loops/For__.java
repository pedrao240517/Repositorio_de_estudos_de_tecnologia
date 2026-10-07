package exercicioNoCodigoJava.iniciante.loops;

import java.util.Scanner;

public class For__ {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("tabuada básica");
        System.out.println("Digite o número da tabuada que quer mostrar: ");
        int numero = sc.nextInt();
        sc.close();

        for (int i = 1; i < 11; i++) {
            int resultado = i * numero;
            System.out.println("Número "+numero+" x"+ i + " ="+resultado);
        }



    }
}
