package NivelIntermediario.Generics;

public class Kunai {
        /*
        Classe da mochila ninja sem  generics
         */

    private String nome; // atributo privado

    public Kunai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public  String toString(){
        return "kunai: " + nome;
    }
}
