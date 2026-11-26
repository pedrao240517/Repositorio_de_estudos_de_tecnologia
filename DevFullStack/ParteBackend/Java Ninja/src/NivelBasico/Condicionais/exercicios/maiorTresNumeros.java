package NivelBasico.Condicionais.exercicios;

public class maiorTresNumeros {
    public static void main(String[] args) {

        int a = 10;
        int b = 12;
        int c = 15;

        if (a > b && a > c){
            System.out.println("a é o maior número");
        }else if (b > a && b > c){
            System.out.println("b é o maior número");
        }else {
            System.out.println("c é o maior número");
        }



    }
}
