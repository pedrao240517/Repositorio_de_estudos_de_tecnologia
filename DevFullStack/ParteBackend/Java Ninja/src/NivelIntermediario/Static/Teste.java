package NivelIntermediario.Static;

public class Teste {

    static String nome = "Bruce";
    static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.cor = "Verde";

        Carro carro2 = new Carro();
        carro2.cor = "Azul";

        System.out.println(carro1.definicao);
        System.out.println(carro1.cor);
        System.out.println(carro2.definicao);
        System.out.println(carro2.cor);


        System.out.println(nome);
        ola();


    }
       static void ola(){
        System.out.println("Olá " + nome);
        }


}
