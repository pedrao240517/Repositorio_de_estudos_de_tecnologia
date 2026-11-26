package NivelBasico.Condicionais.exercicios;

public class notaConceito {
    public static void main(String[] args) {

        double nota = 9;
        if (nota >= 9) {
            System.out.println("Nota A");
        } else if (nota >= 7 && nota <= 8.9) {
            System.out.println("Nota B");
        }else if (nota >= 5 && nota <= 6.9){
            System.out.println("Nota C");
        }else {
            System.out.println("Nota D");
        }


    }
}
