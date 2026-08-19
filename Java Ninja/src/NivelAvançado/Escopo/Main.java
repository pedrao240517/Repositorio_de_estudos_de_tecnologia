package NivelAvançado.Escopo;

public class Main {

    static int idadeGlobal2 = 18;
    int idadeGlobal = 17; // variavel global

    static void main(String[] args) {

         ninja naruto = new ninja();
         naruto.nome = "Naruto Uzumaki";
         naruto.teste();

         ninja.testeestatico();

         //System.out.println(idadeGlobal);  - não funciona pois campos não estáticos não podem ser refernciados em um contexto estático

        Main escopo= new Main();
        System.out.println(escopo.idadeGlobal);

        System.out.println(idadeGlobal2);




    }
}
