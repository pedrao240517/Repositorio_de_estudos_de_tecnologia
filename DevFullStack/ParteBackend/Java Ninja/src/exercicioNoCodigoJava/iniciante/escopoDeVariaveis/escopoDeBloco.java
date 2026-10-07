package exercicioNoCodigoJava.iniciante.escopoDeVariaveis;

public class escopoDeBloco {
    static void main(String[] args) {

        {
            String mensagem = "Eu estou cansado chefe";
            System.out.println(mensagem);
        }

        /*System.out.println(mensagem);
        java: cannot find symbol
           symbol:   variable mensagem( não foi possível encontrar a variavel
        */
    }
}

