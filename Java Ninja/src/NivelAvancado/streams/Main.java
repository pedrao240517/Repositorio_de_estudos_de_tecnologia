package NivelAvancado.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {


        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "vila da folha", 15));
        ninjas.add(new Ninja("Sasuke UChiha", "vila da folha", 18));
        ninjas.add(new Ninja("Sakura Haruno", "vila da folha", 16));
        ninjas.add(new Ninja("Shikamaru Nara", "vila da folha", 20));
        ninjas.add(new Ninja("Hinata Hyuga", "vila da folha", 13));
        ninjas.add(new Ninja("Rock lee", "vila da folha", 17));
        ninjas.add(new Ninja("Neji Hyuga", "vila da folha", 14));
        ninjas.add(new Ninja("temari", "vila da areia", 22));

        System.out.println("");
        System.out.println("");
        System.out.println("===============Filtragem===========================");
        // .Stream - filtragem dos ninjas por vila
        ninjas.stream()
                .filter(ninja1 -> ninja1.getAldeia().equals("vila da folha"))
                .forEach(System.out::println);// soutc

        System.out.println("=================Ordenação=========================");

        // Ordenação
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("===============Ordenação por nome ==========================");

        // Ordenação por nome
        ninjas.stream()
                .sorted((n1, n2) -> String.CASE_INSENSITIVE_ORDER.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);

        System.out.println("===============================MAP por nome==================================");
        // MAP - mostrar e mapear um atributo (mostrar toda a lista
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);


        System.out.println("===============================MAP por idade==================================");
        // MAP - mostrar e mapear um atributo (mostrar toda a lista
        ninjas.stream()
                .map(Ninja::getIdade)
                .forEach(System.out::println);

        System.out.println("==============================MAX================================");
        // MAX - Filtrar por ninja mais velho
         Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println("Ninja filtrado pelo mais velho = " + ninjaMaisVelho);



    }
}
