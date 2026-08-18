package NivelIntermediario.Refatoração;

public class Main {
    static void main(String[] args) {






        System.out.println("=========================NARUTO================================");
        Uzumaki naruto = new Uzumaki( "Naruto Uzumaki", "aldeia da folha", 18, 42, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaNinja();
        naruto.tacarkunai();
        System.out.println(naruto);
        System.out.println(naruto.altura);
        System.out.println("========================SASUKE=================================");

        Uchiha sasuke = new Uchiha( "Sasuke Uchiha", "Aldeia da Folha", 18, 32, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaNinja();
        sasuke.inteligenciaDeCombate(120);
        System.out.println("==========================ITACHI===============================");


        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da folha",26, 400, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();
        itachi.inteligenciaDeCombate(140);
        itachi.provisorio();
        System.out.println("=============================MADARA============================");


        Uchiha madara = new Uchiha( "madara Uchiha ", "aldeia da folha", 49,  900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaNinja();
        //método comum
        madara.inteligenciaDeCombate();
        //metodo sobrecarregado
        madara.inteligenciaDeCombate(200);
        System.out.println("=========================ANBU================================");

        Anbu yamato = new Anbu();
        yamato.nome = ("Yamato");
        System.out.println("Ninja Anbu");
        System.out.println(yamato.nome);
        System.out.println("=========================================================");



        
    }
}
