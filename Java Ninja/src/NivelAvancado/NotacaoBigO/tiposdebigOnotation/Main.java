package NivelAvancado.NotacaoBigO.tiposdebigOnotation;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {


    /* O que é um algoritmo?
    * // algoritmo é tudo que fazemos na programção
    * */

        ArrayList<ninja> ninjas = new ArrayList<>();
        ninjas.add(new ninja("Naruto uzumaki",20));
        ninjas.add(new ninja("Sauke uchiha",20));
        ninjas.add(new ninja("Sakura haruno",20));


        //Algoritmo -  constante O(1)
        System.out.println(ninjas.get(2));

        //Algoritmo  - linear O(n)
        for (ninja loop : ninjas) {
            System.out.println(ninjas);
        }

        System.out.println("---------O(n2)----------");
        // complexidade quadrática - O(n²)
        for (int i = 0; i < 3 ; i++) {
                for (int j = 0; j < 3; j++) {
                System.out.println(ninjas);
                }
        }

        System.out.println("-----------------------notação quadratica-------------------------- ");

        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i)+ " Contra" + ninjas.get(j));
            }
        }







    }
}
