package exercicioNoCodigoJava.Arrays;

import java.util.Scanner;

public class arrayunidmencional {
    static void main(String[] args) {

        double[] notas = new double[4];
        Scanner sc = new Scanner(System.in);
        double media;

        System.out.println("NOTAS");
        System.out.println("digite a nota do 1 bimestre: ");
        notas[0] = sc.nextDouble();
        System.out.println("digite a nota do 2 bimestre: ");
        notas[1] = sc.nextDouble();
        System.out.println("digite a nota do 3 bimestre: ");
        notas[2] = sc.nextDouble();
        System.out.println("digite a nota do 4 bimestre: ");
        notas[3] = sc.nextDouble();
        media = (notas[0]+ notas[1]+ notas[2] +notas[3])/4;
        sc.close();
        System.out.println("A média do ano foi de: " + media);


       /* notas[4]= 3;
        System.out.println(notas[4]);*/





    }
}
