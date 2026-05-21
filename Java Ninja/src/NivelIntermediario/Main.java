package NivelIntermediario;

public class Main {
    static void main(String[] args) {


        // Criar ninja Naruto - Naruto é um o Objeto
        Ninja naruto = new Ninja();

        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia="Aldeia da folha";
        naruto.idade =18;
        

        // Criar ninja Sasuke - Sasuke é um objeto

        Ninja sasuke = new Ninja();

        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia="Aldeia da folha";
        sasuke.idade =27;

        // aplicando métodos aos meus objetos
        sasuke.ShariganAtivado();
        String retornando =sasuke.EuSouUmNinja();
        System.out.println(retornando);

        int quantoTempoFalta = sasuke.TempoHokage(50);
        System.out.println("Você tem " + sasuke.idade + " anos, falta "+ quantoTempoFalta+ " anos para ser hokage");

        // Criar Sakura  - sakura é um objeto

        Ninja Sakura = new Ninja();
        sasuke.nome = "Sakura Haruno";
        sasuke.aldeia="Aldeia da folha";
        sasuke.idade =18;

        

        
        
    }
}
