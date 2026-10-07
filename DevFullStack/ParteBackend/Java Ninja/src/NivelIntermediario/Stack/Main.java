package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        // Inicialização em array
        // são estaticos e tem ref de memória
        String[] NinjasArray = new String[10];
        NinjasArray[0] = "Ninja Naruto";


        // Inicializar Lista
        // são dinamicas e  tamanho aumenta e diminui conforme necesidade
        List<String> ninjaslist = new ArrayList<>();
        ninjaslist.add("Naruto Uzumaki");


        // Stack
        // O ultimo a entrar é o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hinata Hyuga");
        ninjasStack.push("Kakashi Hatake");
        System.out.println("Minha stack atual = "+ ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha stack atualizada com pop = "+ ninjasStack);
        System.out.println("Minha stack atualizada com proximo elemento do topo = "+ ninjasStack.peek());
        System.out.println("Tamanho da Stack = "+ ninjasStack.size() +" elementos");
        System.out.println("Minha stack atual = "+ ninjasStack);







    }
}
