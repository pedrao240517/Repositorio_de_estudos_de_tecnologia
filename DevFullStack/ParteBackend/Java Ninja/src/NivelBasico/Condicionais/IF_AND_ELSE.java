package NivelBasico.Condicionais;

public class IF_AND_ELSE {
    public static void main(String[] args) {
         /*
        *IF e ELSE  - NivelBasico.Condicionais
        *   IF - se condição e resultado
            ELSE - Senão resultado se condição não atendida
            ELSE-IF = se encadeado condição e resultado
        * Objetivo: Passar o ninja de nível de acordo com o número de missões
         */


        String nome = "Naruto Uzumaki"; // Ninja naruto
        int idade = 15;
        boolean Hokage = false;
        short numerodemissoes = 20;
        String rank;
        boolean Kaguha = false;


        if (numerodemissoes == 10 && idade >= 15 ){
            System.out.println("Rank Chunnin.");
        } else if (Kaguha == true) {
            System.out.println("Rank Hokage.");
        } else if (numerodemissoes >= 20) {
            System.out.println("Rank Jounin");
        } else {
            System.out.println("Rank Genin.");
        }


        // SE A CONDIÇÃO ACONTECER, FAÇA ISSO//

        int numero = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;

        if (numero <= numero2){
            System.out.println("Condição aprovada");
        }else {
            System.out.println("Condição não aprovada ");
        }
        boolean temDidheiro = true;
        boolean temCartao = true;

        if (temDidheiro && temCartao ){
            System.out.println("Pede ifood e ze delivery");
        } else if (temDidheiro || temCartao) {
            System.out.println("Pede ifood ");
        }else {
            System.out.println("pede nada seu pobre");
        }



    }
}
