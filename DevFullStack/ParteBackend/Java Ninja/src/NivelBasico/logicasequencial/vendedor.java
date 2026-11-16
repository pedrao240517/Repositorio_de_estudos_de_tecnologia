package NivelBasico.logicasequencial;

public class vendedor {
    public static void main(String[] args) {

        int salario  =  3000;
        int venda =  1000;

        int comissao =  ((venda * 10)/ 100);
        int totalGanho = (salario + comissao);
        System.out.println(totalGanho);


    }
}
