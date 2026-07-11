package NivelIntermediario.Generics.semgenerics;

public class Main {
    static void main(String[] args) {

        Kunai kunai1 = new Kunai("kunai");
        Kunai kunai2 = new Kunai("kunai explosiva ");
        Kunai kunai3 = new Kunai("kunai teletransporte ");


        Bolsakunai bolsakunai = new Bolsakunai();
        bolsakunai.adicionarKunai(kunai1);
        bolsakunai.adicionarKunai(kunai2);
        bolsakunai.adicionarKunai(kunai3);
        System.out.println(bolsakunai);

     

        






    }
}
