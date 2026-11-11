package NivelBasico.SintaxeBasica;

import java.io.IOException;
import java.util.Scanner;


public class SintaxeBasica {
   public static void main(String[] args) throws IOException {


        // Comando de saída- System.out.println e System.out.print
        System.out.println("Escreva seu nome: ");

        //Comando de entrada - Scanner e BuffedReader
        Scanner scaneio = new Scanner((System.in));
        String nome = scaneio.nextLine();
        scaneio.close();

        System.out.println("Nome: "  + nome);
    }
}