package NivelBasico.logicasequencial;

import java.util.Scanner;

public class velocidade {
    public static void main(String[] args) {

        System.out.println("Digite a distância(m): ");
        Scanner input = new Scanner(System.in);
        double distancia = input.nextDouble();
        System.out.println("Tempo Gasto(s): ");
        double tempoGasto = input.nextDouble();
        double velocidade =  distancia / tempoGasto;
        System.out.println("Velocidade Gasto(m/s): " + velocidade);





    }
}
