package NivelIntermediario.List;

import NivelIntermediario.Generics.comgenerics.EquipamentosNinja;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        
        // Array - são estaticos, não alteram de tamanho
        String[] array = new String[3];
        array[0] = ("Slot inicial de um array 0 ");
        array[1] = ("Slot inicial de um array 1 ");
        array[2] = ("Slot inicial de um array 2 ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("=========================");



        // Lista- Não são estaticas, podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>(); // criando na lista

        //Adicionar na lista
        ninjasList.add("Narutinho ");
        ninjasList.add("Sasukeeeee");
        ninjasList.add("LEEEEE");
        ninjasList.add("Minato namikaze- O quarto Hokage");
        System.out.println(ninjasList);
        
        //remover da lista
        ninjasList.remove("LEEEEE");
        System.out.println(ninjasList);

        //Trocar elementos
        ninjasList.set(0,"Hashirama- o primeiro hokage");
        System.out.println(ninjasList);
        
        //ver o tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size() + " elementos");

        // caso eu queira adicionar um objeto como tipo da lista eu posso
        EquipamentosNinja equipamentosNinja0 = new EquipamentosNinja("Kunai de ferro");
        List<EquipamentosNinja> ninjasList2 = new ArrayList<>(); // criando na lista
        ninjasList2.add(equipamentosNinja0);
        System.out.println(ninjasList2);






    }
}
