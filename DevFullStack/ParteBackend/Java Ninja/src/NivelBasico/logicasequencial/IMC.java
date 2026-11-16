package NivelBasico.logicasequencial;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        System.out.println("Digite sua altura:");
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        System.out.println("Digite sua peso:");
        double peso = sc.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("IMC: " + imc );

    }
}
