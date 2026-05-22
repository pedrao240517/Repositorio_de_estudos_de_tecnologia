package NivelIntermediario.Construtores;

public class Main {
    static void main() {

        Hokages hashirama = new Hokages(); // noArgs construtor
        hashirama.nome = "Hashirama Senju";

        Hokages tobirama = new Hokages("Tobirama Senju"); // AllArgs Construtor - com argumento (geralmente não faz)
        System.out.println(tobirama.nome);

        Hokages hiruzen = new Hokages(40); // AllArgs Construtor
        System.out.println(hiruzen.idade);

        System.out.println("================");

        Hokages minatto = new Hokages("Minato Namikaze",32,false); // Allargs construtor com todos os arguemntos
        System.out.println(minatto.nome);
        System.out.println(minatto.idade);
        System.out.println(minatto.vivoOuNao);




    }
}
