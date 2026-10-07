package NivelBasico.Condicionais;

import java.util.Scanner; // Importando o Scanner real do Java

public class ScannerDOUsuário {
    static void main(String[] args) {

        /*
         * Scanner é um jeito de trazer o usuário para dentro da aplicação
         * Objetivo: o usario vai criar m nija e vamos validadr os dados
         */

        // Você deve usar Scanner (do Java) e não ScannerDOUsuário (sua classe)
        Scanner caixadetexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomedonija = caixadetexto.nextLine();
        System.out.println("O nome do ninja é " + nomedonija);

        //receber a idade do ninja
        System.out.println("Escreva a idade do ninja: ");
        int idadeDoNinja = caixadetexto.nextInt();
        System.out.println("Seu ninja tem idade " + idadeDoNinja + " anos");


        // Tratamento de dados

        if (idadeDoNinja >= 18 ){
            System.out.println("Seu ninja já pode receber qualquer missão");
        }else {
            System.out.println("Esse ninja não pode receber missões acima de C ou D");
        }

        // O correto para fechar é .close()
        caixadetexto.close();
    }
}
