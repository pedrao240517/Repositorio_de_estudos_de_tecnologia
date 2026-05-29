package NivelIntermediario.Polimorfismo;

public class Uzumaki extends  Ninja{

    // sobrescrever a classe ninja pelo Uzumaki - polimorfismo
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome+ " e esse meu ataque uzumaki, um ataque de ar e eu conlui "+ numeroDeMissoesConcluida+ " missoes");

    }

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluida, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluida, rank);
    }

    // sobrecarga de método inteligenciaDeCombate();
    @Override
    public void  inteligenciaDeCombate(int qi){
        System.out.println(" Essa é minha inteligência de combate ");

        if (qi > 150 ){
            System.out.println("Seu QI de batalha é "+ qi + " e você é genio");
        }else if (qi >= 130){
            System.out.println("Seu QI de batalha é "+ qi + " e você é ninja promissor");
        }else {
            System.out.println("Seu QI de batalha é "+ qi +" e você é precisa treinar mais suas estrátegias ");
        }
    }

}

