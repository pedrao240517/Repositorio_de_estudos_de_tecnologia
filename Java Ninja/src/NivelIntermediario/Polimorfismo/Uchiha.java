package NivelIntermediario.Polimorfismo;

public class Uchiha extends  Ninja {


    // sobrescrever a classe ninja pelo uchiha - polimorfismo
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse meu ataque uchiha, um ataque de fogo");

    }

    public Uchiha() {
        super();
                
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }


    /*
    public abstract void estrategiaNinja(){
        System.out.println("Invocar o susano");
    }

     */
}
