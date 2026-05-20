package NivelBasico.Condicionais;

public class IF_AND_ELSE {
    static void main() {
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
        System.out.printf("Rank Chunnin.");
    } else if (Kaguha == true) {
        System.out.println("Rank Hokage.");
    } else if (numerodemissoes >= 20) {
        System.out.printf("Rank Jounin");
    } else {
        System.out.println("Rank Genin.");
    }




    // SE A CONDIÇÃO ACONTECER, FAÇA ISSO//







    }
}
