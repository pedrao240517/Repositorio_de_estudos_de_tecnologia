package exercicioNoCodigoJava.iniciante.escopoDeVariaveis;

public class limiteDoEscopoLoop {
    static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            int dobro = 1 * 2;
            System.out.println(dobro);
        }
       /* System.out.println(dobro); - variavel existe apenas no escopo do loop*/




    }
}
