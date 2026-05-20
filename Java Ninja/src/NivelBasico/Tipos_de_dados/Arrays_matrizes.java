package NivelBasico.Tipos_de_dados;

public class Arrays_matrizes {
    static void main(String[] args) {

        String[] ninja = new String[7];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);

        // Redeclarar Array
        ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Minato Namikaze";
        ninja[2] = "Jiraya sensei";
        ninja[3] = "Madara Uchiha";
        ninja[4] = "Kakashi Hatake";
        ninja[5] = "Itachi Uchiha ";
        System.out.println(ninja[2]);

        //for para fazer um loop para percorrer o array

        for (int i = 0; i < 6; i++) {
            System.out.println(ninja[i]);
            
        }

        int[] idade = new int[6];
        idade[0] = 17;
        idade[2] = 17;
        idade[3] = 17;
        idade[4] = 17;


        System.out.println(idade[5]);

            // Redeclarar
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";
        System.out.println(nomeNinja);





        /*
        * double inicializa como 0.0, int como 0 ,boolean como falso, string como null
        * arrays podem ser de qualquer tipo
        * arrays são tipos referência
        * ordenação começa com 0 (index)
        * Caso o slot do array não seja selecionado ele não vai reproduzir todos pois ele não tem a refência
        * São estruturas de dados fundamentais usadas para armazenar uma coleção de elementos do mesmo tipo de dados em locais de memória contíguos.
         */






    }
}
