package NivelBasico.Fundicaodetipos_Casting;

public class tipoextreito {
    public static void main(String[] args) {



        /*
        A conversão de tipo por redução (ou "thresholding type casting") é o processo de reduzir um tipo de dados maior para um menor.
          Em Java, esse processo também é conhecido como conversão ascendente (ou "casting up") ou conversão explícita de tipo.
          Ele não ocorre automaticamente. Se não for feito explicitamente, ocorrerá um erro de compilação.
               A conversão de tipo por redução é insegura, pois pode haver perda de dados devido ao menor intervalo de valores permitidos para o tipo de dados inferior.
            Um operador de conversão (`cast`) auxilia na conversão explícita.

        double -> float -> long -> int -> char -> short -> byte (Da esquerda para a direita: do tipo de dado mais significativo para o mais abstrato)
         */

        int numero = 130;

        byte valorByte = (byte) numero; // int → byte

        System.out.println(numero);
        System.out.println(valorByte);

        double d2 = 10.5;
        int numero2 = (int) d2;

        System.out.println(d2);
        System.out.println(numero2);

        Integer numero3 = 123;
        String numero4 = Integer.toString(numero3);

        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero4 + 3 );





    }
}
