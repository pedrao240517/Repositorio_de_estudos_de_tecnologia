package exercicioNoCodigoJava.Arrays;

public class array2D {
    static void main(String[] args) {


        String[][] agenda = new String[2][2];
        agenda[0][0] = "joao";
        agenda[0][1]= "pedro";
        agenda[1][0]= "mauricio";
        agenda[1][1]= "cleiton";


        for (int i = 0; i < agenda.length; i++) { // Controla as linhas (0 e 1)
            System.out.print("Linha " + i + ": ");

            for (int j = 0; j < agenda[i].length; j++) { // Controla as colunas (0 e 1)
                System.out.print(agenda[i][j] + " - ");
            }

            System.out.println(); // Pula para a próxima linha no console
        }




    }
}
