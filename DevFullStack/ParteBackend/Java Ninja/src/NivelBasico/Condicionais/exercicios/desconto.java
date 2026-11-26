package NivelBasico.Condicionais.exercicios;

public class desconto {
    public static void main(String[] args) {


        float compraValor = 99;

        if (compraValor >= 100) {
            compraValor = compraValor - (compraValor * 10 /100);
            System.out.println("Desconto de 10% aplicado, valor total = " + compraValor);
        } else if (compraValor >= 50 && compraValor <100) {
            compraValor = compraValor - (compraValor * 5 /100);
            System.out.println("Desconto de 5% aplicado, valor total = " + compraValor);
        }else {
            System.out.println("Sem desconto aplicado= " + compraValor);
        }


    }
}
