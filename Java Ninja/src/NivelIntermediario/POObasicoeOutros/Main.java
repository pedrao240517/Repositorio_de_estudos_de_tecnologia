package NivelIntermediario.POObasicoeOutros;

public class Main {
    static void main(String[] args) {


        // Criar ninja Naruto - Naruto é um o Objeto 1
        Uzumaki naruto = new Uzumaki();

        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia="Aldeia da folha";
        naruto.idade =18;
        naruto.AumentoDechakra();


        

        // Criar ninja Sasuke - Sasuke é um objeto 2

        Uchiha sasuke = new Uchiha();

        sasuke.nome ="Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia ="Vila da Folha";
        sasuke.ShariganAtivado();


        /*
        // aplicando métodos aos meus objetos
        sasuke.ShariganAtivado();
        String retornando =sasuke.EuSouUmNinja();
        System.out.println(retornando);

        int quantoTempoFalta = sasuke.TempoHokage(50);
        System.out.println("Você tem " + sasuke.idade + " anos, falta "+ quantoTempoFalta+ " anos para ser hokage");

         */

        // Criar Sakura  - sakura é um objeto 3

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia="Aldeia da folha";
        Sakura.idade =18;
        Sakura.Regeneracao();

        // Criar Hinata  - hinata é um objeto 4

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata  Hyuga";
        Hinata.aldeia="Aldeia da folha";
        Hinata.idade =18;
        Hinata.Byakugan();
        

        // Criar Boruto - Boruto é um Objeto 5

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto  Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.AumentoDechakra();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();






        

        
        
    }
}
