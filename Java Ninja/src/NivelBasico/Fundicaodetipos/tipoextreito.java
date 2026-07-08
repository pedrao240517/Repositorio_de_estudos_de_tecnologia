package NivelBasico.Fundicaodetipos;

public class tipoextreito {
    static void main(String[] args) {



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

        System.out.println(valorByte);


    }
}
