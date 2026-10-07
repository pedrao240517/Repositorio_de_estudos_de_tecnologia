package NivelAvancado.NotacaoBigO.tiposdebigOnotation;

public class ninja {

    String nome;
    int idade;

    public ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }


}
