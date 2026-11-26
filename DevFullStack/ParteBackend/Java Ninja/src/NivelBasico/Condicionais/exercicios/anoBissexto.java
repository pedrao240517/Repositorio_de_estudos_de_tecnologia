package NivelBasico.Condicionais.exercicios;

public class anoBissexto {
    public static void main(String[] args) {


        int ano = 2003;


        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ) {
            System.out.println("Ano bissexto");
        }else{
            System.out.println("Ano comum");
        }


    }
}
