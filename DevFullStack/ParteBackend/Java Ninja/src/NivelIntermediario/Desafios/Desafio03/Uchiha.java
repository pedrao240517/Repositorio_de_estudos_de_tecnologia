package NivelIntermediario.Desafios.Desafio03;

public class Uchiha extends Ninja {
    String habilidadeEspecial ="Sharigan"; // criando a habilidade dos uchihas

    public void mostrarHabilidadeEspecial( ){  // sobrescreendo a habilidade especial em mostrar informações
        System.out.println("Minha habilidade é "+habilidadeEspecial);

    }
    public void mostrarInfomacoes(){   // Criando o método procedimento
        System.out.println("Meu nome é " + nome+ " tenho "+ idade +" anos");
        System.out.println("Minha missão é "+missao+" de nivel "+ nivelDeDificuldade+ " e foi "+statusDaMissao);
        System.out.println("Minha habilidade é "+habilidadeEspecial);
    }
}
