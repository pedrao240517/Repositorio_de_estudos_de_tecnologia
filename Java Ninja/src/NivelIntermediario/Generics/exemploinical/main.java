package NivelIntermediario.Generics.exemploinical;

import NivelIntermediario.Generics.semgenerics.Kunai;

public class main {
    static void main(String[] args) {

        bolsaninja<Object> bolsaninja = new bolsaninja<>();
        bolsaninja.adicionarferramenta(new Kunai("Kunai explosiva"));


        System.out.println("itens da bolsa ninja ");
        bolsaninja.mostrarferramentas();



    }
}
