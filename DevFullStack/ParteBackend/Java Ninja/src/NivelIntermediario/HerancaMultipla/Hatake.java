package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements Sharigan, Anbu,Hokage {

    public void boasVindas(){
        System.out.println(nome +  " eu sou um hatake");
    }
    // método da interface
    public void shariganAtivado(){
        System.out.println("Meu sharigan ativou");
    }

   public void ninjaDeelite(){
       System.out.println("Eu sou um ninja de elite da ANBU");
   }
   public void hokage(){
       System.out.println(nome+ " eu sou um hokage");
   }

}



