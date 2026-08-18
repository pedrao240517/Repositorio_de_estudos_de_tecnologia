package NivelIntermediario.Set;

import java.util.*;

public class Main {
    static void main(String[] args) {


        List<String> ninjas = new ArrayList<>();

        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha ");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzou");
        ninjas.add("Boruto Uzumaki");
        ninjas.remove(0);



        System.out.println("Ninjas: " + ninjas);
        System.out.println("-----------------SET-----------------");


        Set<String> ninjasset = new HashSet<>();// set mais usado quando implementado
        ninjasset.addAll(ninjas);
        ninjasset.remove("Sakura Haruno");// remove o objeto da lista
        System.out.println("Ninjas set: " + ninjasset); // o outro naruto não foi adicionado na memória

        ninjasset.add("Naruto");
        ninjasset.add("Sasuke");
        ninjasset.add("Sakura");
        ninjasset.add("Naruto");

        System.out.println("-------------TreeSet----------");
        Set<String> ninjas2 = new TreeSet<>();
        ninjas2.addAll(ninjas);

        System.out.println("NinjasTreeSet: "+ ninjas2);







    }
}
