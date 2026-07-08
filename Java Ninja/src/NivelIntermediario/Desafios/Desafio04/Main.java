package NivelIntermediario.Desafios.Desafio04;

public class Main {
    static void main(String[] args) {

        ninjaBasico ninjaBasico = new ninjaBasico("Naruto Uzumaki", 16,  "clone das sombras");
        ninjaBasico.mostrarinformacoes();
        ninjaBasico.executarhabilidade();
        System.out.println("==============================================");

        ninjaAvançado ninjaavancado = new ninjaAvançado("Kakashi Hatake",32,"jutsu de transformação","dominio dos 5 elementos ");
        ninjaavancado.mostrarinformacoes();
        ninjaavancado.executarhabilidade();


        // main - falta fazer o desafio mais complicado
        
    }
}
