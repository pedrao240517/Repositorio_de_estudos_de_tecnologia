package NivelBasico.Condicionais.exercicios;

public class TipoDeTriangulo {
    public static void main(String[] args) {

        int lado1=10;
        int lado2=8;
        int lado3=10;

        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3 ) {
            System.out.println("Triângulo equilatero");
        } else if ((lado1 == lado2 || lado1 == lado3) || (lado2 ==lado3 || lado2 == lado1)||(lado3 == lado2 || lado3 == lado1)  ) {
            System.out.println("Triãngulo isóceles");
        }else{
            System.out.println("Triângulo Escalenos");
        }


    }
}
