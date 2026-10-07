package NivelIntermediario.Generics.exemploinical;

import java.util.List;

public class bolsaninja<T> { // inicializou uma bolsa generica


    // Inicializar nosso array list generic
    private List<T> ferramentas;

    // Colocar ferramentas na nossa Lista (array) - metodo que recebe como argumento uma nova ferramenta

    public  void adicionarferramenta (T ferramenta){
        ferramentas.add(ferramenta);

    }

    public bolsaninja() {
        this.ferramentas = ferramentas;
    }

    // mostrar lista de ferramentas

    public void mostrarferramentas(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }








}
