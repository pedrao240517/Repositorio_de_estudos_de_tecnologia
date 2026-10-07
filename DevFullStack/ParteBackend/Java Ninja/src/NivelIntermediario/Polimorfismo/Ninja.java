package NivelIntermediario.Polimorfismo;

public  abstract class Ninja implements EstrategiaDeBatalha {

        //TODO: Incluir novos atributos  : numeroDeMissoesConcluidas e nivelDoNinja
        // nivelDoNinja - Gennin , Chunnin , Jounin , hokage
        String nome;
        String aldeia;
        int Idade;
        int numeroDeMissoesConcluida;
        NivelNinja rank;
        final double altura = 1.78;


        // Método geral ! Todos os ninjas vão ter
        public void habilidadeEspecial() {
                System.out.println("Meu nome é " + nome + " e esse meu ataque especial");

        }

        /*
        // Método abstrato obrigatorio em todas as classes
        public abstract void estrategiaNinja();
         */
        //sobrescrevendo o método da interface  em uma classe abstrata
        @Override
        public void estrategiaNinja() {
                System.out.println("Essa é minha estratégia de combate ");

        }

        //   TODO NINJA VAI FAZER OBRIGATORIAMENTE

        final void tacarkunai() {
                System.out.println("Eu sou um método da classe mãe");
        }

        public Ninja() {
        }

        public Ninja(String nome, String aldeia, int idade) {
                this.nome = nome;
                this.aldeia = aldeia;
                this.Idade = idade;
        }

        //TODO: Sobrecarga do construtor, chmando os novos atributos

        // sobrecarga de métodos você não precisa redeclarar o construtor só os novos atributos

        public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluida, NivelNinja rank) {
                this(nome, aldeia, idade);
                this.numeroDeMissoesConcluida = numeroDeMissoesConcluida;
                this.rank = rank;
        }

        // sobrecarga de método inteligenciaDeCombate(); padrao
        public void inteligenciaDeCombate() {
                System.out.println(" Essa é minha inteligência de combate ");
        }

        // sobrecarga de método inteligenciaDeCombate();
        public void inteligenciaDeCombate(int qi) {
                System.out.println(" Essa é minha inteligência de combate ");

                if (qi > 150) {
                        System.out.println("Seu QI de batalha é " + qi + " e você é genio");
                } else if (qi >= 130) {
                        System.out.println("Seu QI de batalha é " + qi + " e você é ninja promissor");
                } else {
                        System.out.println("Seu QI de batalha é " + qi + " e você é precisa treinar mais suas estrátegias ");
                }
        }

        // método sem overrride
        public void provisorio() {
                System.out.println("teste");
        }


        @Override
        public String toString() {
                return ("Esse é o método toString para referência de  memória");
        }
}


    
