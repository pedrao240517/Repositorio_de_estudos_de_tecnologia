package NivelBasico.Condicionais;

public class lacoDeRepetição {
    static void main(String[] args) {

        /*
        *laços de repetição; vão repeitir infinitamente ou até atingir o parâmetro desejado
        * while = for
         */

        // While
        // while (condição) {tudo vai aconteer}
        int numeroDeClones =0;
        int numeroMaximoDeClones = 40;


        while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println(("O naruto fez um clone das sombras. " + numeroDeClones));
        }

        //For -> for(inicialização; condição; incremento) { // código }

        for (int i = numeroDeClones; i < numeroMaximoDeClones ; i++) {
            System.out.println("O naruto fez um clone das sombras " + i);
        }

    }
}
