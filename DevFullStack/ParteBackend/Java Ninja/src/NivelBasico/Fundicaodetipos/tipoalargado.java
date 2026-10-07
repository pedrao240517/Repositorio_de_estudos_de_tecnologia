package NivelBasico.Fundicaodetipos;

public class tipoalargado {
    static void main(String[] args) {


        /*
        processo de converter um tipo de dado inferior para um tipo de dado superior.
        Também é conhecida como conversão implícita ou casting para baixo.
         Esse processo é realizado automaticamente e é seguro, pois não há risco de perda de dados.
        Esse tipo de conversão de tipo em Java ocorre quando:

        O tipo de destino é maior que o tipo de origem.

        Os dois tipos de dados são compatíveis.

        byte -> short -> char -> int -> long -> float -> double
         */


        int numero = 18; // criando varivael de tipo maior

        double valor = numero;

        System.out.println("Número: "+ numero);
        System.out.println("Valor: "+ valor);







    }
}
