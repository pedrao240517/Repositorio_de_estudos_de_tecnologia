package NivelIntermediario.Generics.semgenerics;

import java.util.ArrayList;
import java.util.List;

public class Bolsakunai {

    private List<Kunai> kunais;

    public Bolsakunai() { // construtor
        this.kunais = new ArrayList<>();
    }

    public List<Kunai> getKunais() { // getter de list array
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) { // setter de list array
        this.kunais = kunais;
    }

    public void adicionarKunai(Kunai kunai){
        kunais.add(kunai);
    }

    @Override
    public  String toString(){ // método to string  // método pra mostrar kunais
        return "Bolsa de kunais: " + kunais.toString();
    }

}
