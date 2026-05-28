package NivelIntermediario.Desafios.Desafio02;

public class ninjaAvançado implements Ninja{


    // Atributos
    String nome;
    int idade;
    String habilidade;
    String especialidade;



    public ninjaAvançado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, minha habilidade é " + habilidade + " e minha especialidade é " + especialidade);
    }

    @Override
    public void executarhabilidade() {
        System.out.println("O ninja " + nome + " está executando a habilidade " + habilidade);


    }
}





