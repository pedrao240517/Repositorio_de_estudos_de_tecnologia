package Queue;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueAula {
    static void main(String[] args) {


    //Inicialização de array - Matriz
        String [] ninjaArray = new String[4];

    // Inicialização de Lista
        List<String> ninjaslist = new ArrayList<String>();

    // Inicialização de Stack - Pilha
        Stack<String> ninjasstack = new Stack<String>();

    // Incialização de Queue - Filas

        /*
        Queue<String> ninjasqueue = new Queue<String>();  // Erro

         */
       Queue<String> ninjasQueue = new LinkedList<>();
       ninjasQueue.add("Naruto");
       ninjasQueue.add("Sasuke");
       ninjasQueue.add("Sakura");
       ninjasQueue.add("Kakashi");
       ninjasQueue.add("Shikamaru");

       // Mostrar a Fila
        System.out.println("Ninjas na fila "+ ninjasQueue);

       // Tirar um ninja da fila
       ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll "+ ninjasQueue);

       // Como Ver quem é o primeiro
        ninjasQueue.peek();
        System.out.println("Ninjas no head: "+ ninjasQueue.peek());

        // Adcionar na lista
        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na fila "+ ninjasQueue);

        // Deletar o Tail - Não da pra tirar ou seja você se ferra pois tem que tirar tudo mundo.

        // Esvaziar fial
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        // Verificar se está vazia a fila
        if (ninjasQueue.isEmpty()){
            System.out.println("-------------------------------");
            System.out.println("Fila Vazia");
        }






































    }
}
