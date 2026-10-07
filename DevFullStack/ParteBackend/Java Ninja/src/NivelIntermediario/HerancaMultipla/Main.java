package NivelIntermediario.HerancaMultipla;

public class Main {
    static void main(String[] args) {
        
        // obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "sasuke";
        sasuke.aldeia = "aldeia da folha";
        sasuke.idade = 17;
        sasuke.boasVindasUchiha();
        sasuke.shariganAtivado();

        // obj hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "kakashi hatake";
        kakashi.aldeia = "aldeia da folha";
        kakashi.idade = 37;
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeelite();
        kakashi.hokage();
        


        
        
    }
}
