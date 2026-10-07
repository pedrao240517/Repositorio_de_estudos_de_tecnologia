package NivelIntermediario.Generics.comgenerics;

import java.util.ArrayList;
import java.util.List;

public class Bolsagenerica<T> {
    private List<T> equipamentos;

    public Bolsagenerica() {
        this.equipamentos = new ArrayList<>();
    }

    // Colocar equipamentos genericos
    public void adicionarEquipamento(T equipamentoGenerico) {
        this.equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public  String toString(){ // método to string
        return "Bolsa de equipamentos "  + equipamentos.toString();
    }
}
