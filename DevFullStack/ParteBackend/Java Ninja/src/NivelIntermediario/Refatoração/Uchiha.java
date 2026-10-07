package NivelIntermediario.Refatoração;

public class Uchiha extends Ninja implements shariganAtivado {


    // Criar constutores
    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluida, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluida, rank);
    }
/*
* Método
* implementa da interface sharigan
* */
    public void shariganAtivado(){
        System.out.println(nome + "Ativou o sharigan");
    }








}


