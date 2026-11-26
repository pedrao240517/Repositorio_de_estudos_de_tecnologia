package NivelBasico.Condicionais.exercicios;

public class verificartriangulo {
    public static void main(String[] args) {

        int lado1 = 3;
        int lado2 = 4;
        int lado3 = 8;

        if (lado1 + lado2 > lado3 && lado1 + lado3 < lado2 && lado2+ lado3 < lado1 && lado1 > 0 && lado2 > 0 && lado3 > 0) {
            System.out.println("Podem formar um triângulo");
        }else {
            System.out.println("Não podem formar um triângulo");
        }


    }
}
