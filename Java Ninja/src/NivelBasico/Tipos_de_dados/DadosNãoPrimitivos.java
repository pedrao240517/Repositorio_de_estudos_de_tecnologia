package NivelBasico.Tipos_de_dados;

public class DadosNãoPrimitivos {
    static void main(String[] args) {
        // tudo que for digitado aqui dentro com o comando psvm vai ser copilado pelo java

        /*
        *Dados não primitivos - String, array, class, enuns e etc
        *Objetivo: criar um ninja é atribuir métodos a ele.
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // tuuppercase vai colocar tudo em capslock
        System.out.println("Olá, " + nomeUpperCase);
        System.out.println("Você é mesmo o " + nome + "?");



        String aldeia = "ALDEIA DA FOLHA";
        String Aldeiacaixabaixa = aldeia.toLowerCase(); // tolowercase vai colocar tudo em caixa baixa/minuscúlo
        System.out.println(Aldeiacaixabaixa);

        String nomes = "Sasuke Uchiha";
        int nomemetodo = nomes.length(); // length retorna o número de caracteres das sting
        System.out.println(nomemetodo);



    }
}