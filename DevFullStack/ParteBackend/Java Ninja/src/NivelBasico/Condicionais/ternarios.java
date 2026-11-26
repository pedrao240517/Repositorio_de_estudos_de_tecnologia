package NivelBasico.Condicionais;

public class ternarios {
    public static void main(String[] args) {

            /*
            *ternário server pra reduzir o código
            * estrutura ->  varivel = condição ? valorSeVerdadeiro : valorSeFalso (if e else reduzido)
            *
             */

                short numeroDeMissoes = 9;
                String nivel = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões " : "Esse ninja tem menos de 10 missoes";
                System.out.println(nivel);











    }
}
