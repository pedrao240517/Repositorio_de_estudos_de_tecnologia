package NivelIntermediario.Generics.semgenerics;

public class Kunai {

        /*
        Classe da mochila ninja sem  generics
         */

    private String nome; // atributo privado

    public Kunai(String nome) { // all constructors

        this.nome = nome;
    }

    public String getNome() {  // getter nome

        return nome;
    }

    public void setNome(String nome) {// setter nome

        this.nome = nome;
    }



    @Override
    public  String toString(){ // método to string
        return "kunai: " + nome;
    }
}
