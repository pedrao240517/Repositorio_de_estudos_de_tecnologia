package NivelIntermediario.Polimorfismo;

public class Main {
    static void main(String[] args) {
       

        



        //obj Ninja Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaNinja();


        //obj Ninja Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

        //obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da folha",27);
        itachi.habilidadeEspecial();

        /*
        // obj ninja não da pra ser criado
        Ninja ninjagenerico = new Ninja();
        ninjagenerico.nome = "Genericao";
        ninjagenerico.habilidadeEspecial();

         */


        
    }
}
