package exercicioNoCodigoJava.iniciante.garbagecollector;

public class garbage {
    static void main(String[] args) {

        personagem ninja = new personagem();
        ninja.nome = "Naruto";
        ninja  = new personagem();
        ninja.nome = "Sasuke";
        System.out.println(ninja.nome);

        /*
        * O objeto de "Naruto" é apagado da memória pelo
        * Garbage Collector porque a referência dele foi
        * escrita pelo segundo new personagem(),
        * tornando-o um espaço inútil que precisa ser reciclado.*/


    }
}
