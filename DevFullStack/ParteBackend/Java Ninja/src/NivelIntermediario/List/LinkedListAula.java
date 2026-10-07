package NivelIntermediario.List;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class LinkedListAula {
    static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");
        System.out.println(linkedList);

        linkedList.add("Kakashi Hatake");

        System.out.println(linkedList);
        linkedList.remove( 2);
        System.out.println(linkedList);

        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        Stack<String> stack = new Stack<>();



    }
}
