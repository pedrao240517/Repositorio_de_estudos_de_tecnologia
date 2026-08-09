package NivelIntermediario.Desafios.Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        int escolha = 0;

        LinkedList<Ninja> lista = new LinkedList<Ninja>(); // iniciar um alinked list com 7 ninjas

        // adicionar os ninjas na linked list
        lista.add(new Ninja("Naruto", "folha", 18));
        lista.add(new Ninja("Sasuke", "folha", 18));
        lista.add(new Ninja("Hinata", "folha", 18));
        lista.add(new Ninja("Sakura", "folha", 18));
        lista.add(new Ninja("Kakashi", "folha", 35));
        lista.add(new Ninja("Hashirama", "folha", 41));
        lista.add(new Ninja("Temari", "Areia", 42));

        // adicionar o ninja no inicio da lista
        lista.addFirst(new Ninja("Boruto", "folha", 9));
        System.out.println();

        // remover do início da lista - removeu o boruto
        Ninja removido = lista.removeFirst();
        System.out.println("Ninja removido = " + removido);

        // Procurar um ninja por indice
        Ninja   terceiroNinja = lista.get(2);
        System.out.println("Ninja terceiro = " + terceiroNinja);

        //Listar os ninjas
        System.out.println("---------------------Lista de ninjas--------------------------");
        for (Ninja ninja : lista) {
            System.out.println(ninja);
        }

        // Desafio com concluído  - Mode mais Dificil não








    }
}
