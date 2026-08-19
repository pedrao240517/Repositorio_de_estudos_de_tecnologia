package NivelAvançado.NotacaoBigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;


        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < 50000; i++) {
            arrayList.add(i);
            linkedList.add(i);


        }

        inicio = System.nanoTime();


        // verificar o número no index do array list
        arrayList.remove(400);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo no array list: "+ tempo + " ns.");

        // verificar o número no index do linkedlist
        inicio = System.nanoTime();
        linkedList.remove(400);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo no linkedlist: "+ tempo + " ns.");






    }
}
