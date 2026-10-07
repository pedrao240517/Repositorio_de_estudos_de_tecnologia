package NivelBasico.SintaxeBasica.exerciciosSintaxeBasica;

import java.util.Scanner;

public class ex002 {
    static void main() {

        System.out.println("Qual é seu nome? ");
        Scanner leitura = new Scanner(System.in);
        String nome = leitura.nextLine();
        leitura.close();
        System.out.println("Olá "+ nome+ " seja bem vindo !");
    }
}
