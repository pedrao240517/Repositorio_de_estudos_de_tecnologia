package NivelBasico.Condicionais.exercicios;

public class faixaEtaria {
    public static void main(String[] args) {

        int idade = 12;

        if (idade >= 60){
            System.out.println("você é um idoso");
        } else if (idade <=59 && idade >=18) {
            System.out.println("Você é um adulto");
        } else if (idade <= 17 && idade >=13) {
            System.out.println("Você é um adolescente ");
        }else {
            System.out.println("Você é uma criança");
        }


    }
}

