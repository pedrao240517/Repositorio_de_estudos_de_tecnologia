package exercicioNoCodigoJava.loops;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class foreach {
    public foreach() {
    }

    @Override
    public String toString() {
        return "foreach{}";
    }

    static void main(String[] args) {

        String[] jogos = new String[3];
        jogos[0] =  "Minecraft";
        jogos[1] =  "DLS";
        jogos[2] =  "WSC";
        for (String jogo : jogos){
            System.out.println("jogo: "+jogo);
        }

        // de maneira simples ee diz pra cada variavel jogo percorra todos os jogos














    }
}
