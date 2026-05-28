package NivelIntermediario.Desafios.Desafio02;

public class ninjaBasico implements Ninja {
    //atributos
    String nome ;
    int idade;
    String habilidade;



    
    public ninjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;

    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("======================================");
        System.out.println("Meu nome é "+ nome);
        System.out.println("Eu tenho "+ idade+ " anos");
        System.out.println("minha habilidade é "+ habilidade);


    }

    @Override
    public void executarhabilidade() {
        System.out.println("O ninja "+nome+ " está executando a habilidade "+ habilidade);


    }


}
