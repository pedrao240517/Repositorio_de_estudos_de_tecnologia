package NivelAvancado.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {


        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "vila da folha", 18));
        ninjas.add(new Ninja("Sasuke UChiha", "vila da folha", 18));
        ninjas.add(new Ninja("Sakura Haruno", "vila da folha", 18));
        ninjas.add(new Ninja("Shikamaru Nara", "vila da folha", 18));
        ninjas.add(new Ninja("Hinata Hyuga", "vila da folha", 18));
        ninjas.add(new Ninja("Rock lee", "vila da folha", 18));
        ninjas.add(new Ninja("Neji Hyuga", "vila da folha", 18));
        ninjas.add(new Ninja("temari", "vila da areia", 18));

        // .Stream - filtragem dos ninjas por vila 
        ninjas.stream()
                .filter(ninja1 -> ninja1.getAldeia().equals("vila da areia"))
                .forEach(System.out::println);// soutc


    }
}
