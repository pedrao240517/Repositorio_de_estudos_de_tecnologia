package NivelBasico.SintaxeBasica.exerciciosSintaxeBasica;

import java.util.Scanner;

public class ex003 {
    static void main(String[] args) {


        System.out.println("Qual é seu nome? ");
        Scanner leitura = new Scanner(System.in);
        String nome = leitura.nextLine();
        System.out.println("Quanto você ganha? ");
        Float salario = leitura.nextFloat();
        System.out.println("A funcionária/ "+ nome "ganha "+ salario " reais.");

        leitura.close();

    }
}
