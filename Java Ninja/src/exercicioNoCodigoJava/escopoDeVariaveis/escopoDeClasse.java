package exercicioNoCodigoJava.escopoDeVariaveis;

public class escopoDeClasse {
        // Escopo de Classe (Atributo global da classe)
        String aldeia = "Aldeia da Folha";

        public void atacar() {
            // O método 'atacar' consegue acessar a variável da classe
            System.out.println("Atacando a partir da: " + aldeia);
        }

        public void defender() {
            // O método 'defender' também consegue acessar a mesma variável
            System.out.println("Defendendo a: " + aldeia);
        }

        public static void main(String[] args) {
            escopoDeClasse ninja = new escopoDeClasse();
            ninja.atacar();
            ninja.defender();
        }

}
