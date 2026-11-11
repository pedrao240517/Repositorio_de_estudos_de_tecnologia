package NivelBasico.OperadoresAritméticos;

public class operadoresAritmeticos {
    public static void main(String[] args) {


// Operador de soma e subtração
        double pao = 10.50;
        double queijo = 7.00 ;
        double  presunto = 13.33;
        double desconto  = 0.10;

        double soma = pao + queijo + presunto;
        double precoDesconto = soma * desconto;
        System.out.println("Valor Total: " + soma);
        System.out.println("Valor Total com desconto: " + precoDesconto);

// Operador de divisão e multiplicação

    double dinheiro = 33.20;
    double pessoas = 2;
    double aposta = 3;

    double dinheiroPessoa = (dinheiro / pessoas);
    double dinheiroAposta = (aposta  * dinheiro);
    System.out.println("Valor de dinheiro por pessoa: " + dinheiroPessoa);
    System.out.println(String.format("Valor  do dinheiro apos apostas: " + dinheiroAposta));





    }
}

