package NivelBasico.Condicionais.exercicios;

public class classificaçãoatleta {
    public static void main(String[] args) {

        int idade = 36;

        if (idade <= 13 && idade  <14) {
            System.out.println("Atleta Infatil");
        } else if (idade >= 14 && idade <= 17 ) {
            System.out.println("Atleta Juvenil");
        } else if (idade >=18 && idade <36) {
            System.out.println("Atleta Adulto");
        }else {
            System.out.println("Atleta Master");
        }


    }
}
