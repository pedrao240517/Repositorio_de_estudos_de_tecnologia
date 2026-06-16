package NivelIntermediario.Polimorfismo;

public class Main {
    static void main(String[] args) {
       

        



        //obj Ninja Uzumaki
        Uzumaki naruto = new Uzumaki( "Naruto Uzumaki", "aldeia da folha", 18, 42, NivelNinja.GENIN);
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaNinja();
        System.out.println(naruto);
        System.out.println("=========================================================");


        //obj Ninja Uchiha
        Uchiha sasuke = new Uchiha( "Sasuke Uchiha", "Aldeia da Folha", 18, 32, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaNinja();
        sasuke.inteligenciaDeCombate(120);
        System.out.println("=========================================================");

        //obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da folha",27);
        itachi.habilidadeEspecial();
        itachi.inteligenciaDeCombate(140);
        itachi.provisorio();
        System.out.println("=========================================================");

        // obj Uchiha 3
        Uchiha madara = new Uchiha( "madara Uchiha ", "aldeia da folha", 49,  900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaNinja();
        //método comum
        madara.inteligenciaDeCombate();
        //metodo sobrecarregado
        madara.inteligenciaDeCombate(200);
        System.out.println("=========================================================");


        /*
        // obj ninja não da pra ser criado
        Ninja ninjagenerico = new Ninja();
        ninjagenerico.nome = "Genericao";
        ninjagenerico.habilidadeEspecial();

         */


        
    }
}
