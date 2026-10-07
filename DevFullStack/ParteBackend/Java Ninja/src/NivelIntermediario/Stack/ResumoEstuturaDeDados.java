package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ResumoEstuturaDeDados {
    static void main(String[] args) {

        // Array
        String[] nomeNinjaArray = new String[4];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha ";
        nomeNinjaArray[2] = "Sakura Haruno";
        /*
        nomeNinjaArray[5] = "Hinata Hyuga"; erro de compilação
         */

        // Devolve o endereço mémoria - @27716f4
        System.out.println("----------------------ARRAY-----------------------------");
        System.out.println("Nome do Ninja Array = " + nomeNinjaArray);

        // valor atribuido
        System.out.println("Nome do Ninja Array = " + nomeNinjaArray[0]);

        // sem valor - Null
        System.out.println("Nome do Ninja Array = " + nomeNinjaArray[3]);
        System.out.println("----------------------LISTA-----------------------------");

        //lISTA - UM ARRAY COM SUPERPODERES

        List<String>nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki"); // adicionar elementos na lista
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha ");

        System.out.println("Nome do Ninja List = " + nomeNinjaList); // printar toda lista

        System.out.println("----------------------STACK-----------------------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha"); // adicionar elementos do stack
        nomeNinjaStack.push("Sakura Haruno");
        nomeNinjaStack.push("Itachi Uchiha");
        System.out.println("Mostrar  Stack = " + nomeNinjaStack); // printar toda stack
        System.out.println("tirar da stack  = " + nomeNinjaStack.pop()); // tirar elementos o stack
        System.out.println("Mostrar  Stack = " + nomeNinjaStack);
        System.out.println("Ninja no topo(sem remover): " + nomeNinjaStack.peek());










    }
}
