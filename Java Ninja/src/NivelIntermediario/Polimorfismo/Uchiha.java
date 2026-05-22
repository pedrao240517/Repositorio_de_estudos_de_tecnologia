package NivelIntermediario.Polimorfismo;

public class Uchiha extends  Ninja {


    // sobrescrever a classe ninja pelo uchiha - polimorfismo
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome+ " e esse meu ataque uchiha, um ataque de fogo");

    }
}
