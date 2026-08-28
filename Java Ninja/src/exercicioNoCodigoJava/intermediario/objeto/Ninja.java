package exercicioNoCodigoJava.intermediario.objeto;


public class Main {
    public static void main(String[] args) {
        // Criando o objeto 'sasuke' a partir da classe Ninja
        Ninja sasuke = new Ninja();

        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;

        System.out.println("Nome do ninja: " + sasuke.nome);
    }
}