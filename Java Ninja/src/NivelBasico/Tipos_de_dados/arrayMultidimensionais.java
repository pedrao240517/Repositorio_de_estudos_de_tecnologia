package NivelBasico.Tipos_de_dados;

public class arrayMultidimensionais {
    static void main(String[] args) {


        /
        
        String[][] ninjasEaldeias = new String[3][3];
        
        ninjasEaldeias[0][0] = "Konaha";
        ninjasEaldeias[0][1] = "Naruto Uzumaki";
        ninjasEaldeias[0][2] = "Sasuke Uchiha";

        ninjasEaldeias[1][0] = "Areia" ;
        ninjasEaldeias[1][1] = "Gaara";
        ninjasEaldeias[1][2] = "Tentei";

        ninjasEaldeias[2][0] = "Nevoa";
        ninjasEaldeias[2][1] = "Zabuza";
        ninjasEaldeias[2][2] = "Haku";
        


        for (int i = 0; i < ninjasEaldeias.length; i++) {
            System.out.println("Aldeia "+ninjasEaldeias[i][0] +" " +ninjasEaldeias[i][1]+" " +ninjasEaldeias[i][2]);

        }



    }
}
