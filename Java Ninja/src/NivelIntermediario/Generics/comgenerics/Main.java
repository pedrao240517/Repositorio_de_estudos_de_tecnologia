package NivelIntermediario.Generics.comgenerics;

public class Main {
    static void main(String[]  args) {

        EquipamentosNinja equipamentosNinja0 = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja equipamentosNinja1 = new EquipamentosNinja("Kunai de fogo");
        EquipamentosNinja equipamentosNinja2 = new EquipamentosNinja("Kunai de água ");
        EquipamentosNinja equipamentosNinja3 = new EquipamentosNinja("Kunai de telestranporte");

        Bolsagenerica<EquipamentosNinja> bolsagenerica = new Bolsagenerica<>();
        bolsagenerica.adicionarEquipamento(equipamentosNinja0);
        bolsagenerica.adicionarEquipamento(equipamentosNinja1);
        bolsagenerica.adicionarEquipamento(equipamentosNinja2);
        bolsagenerica.adicionarEquipamento(equipamentosNinja3);

        System.out.println(bolsagenerica);







    }
}
