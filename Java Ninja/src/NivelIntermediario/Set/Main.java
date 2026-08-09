package NivelIntermediario.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main(String[] args) {


        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Naruto");
        


        System.out.println("Ninjas: " + ninjas);


        Set<String> ninjasset = new HashSet<>();
        ninjasset.addAll(ninjas);
        ninjasset.add("Naruto");
        ninjasset.add("Sasuke");
        ninjasset.add("Sakura");
        ninjasset.add("Naruto");
        System.out.println("Ninjas: " + ninjasset); // o outro naruto não foi adicionado na memória





    }
}
