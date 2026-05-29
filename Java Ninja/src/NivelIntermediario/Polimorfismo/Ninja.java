package NivelIntermediario.Polimorfismo;

public  abstract class Ninja implements EstrategiaDeBatalha {


        String nome;
        String aldeia;
        int Idade;

        // Método geral ! Todos os ninjas vão ter
        public void habilidadeEspecial(){
            System.out.println("Meu nome é "+ nome+ " e esse meu ataque especial");

        }

        /*
        // Método abstrato obrigatorio em todas as classes
        public abstract void estrategiaNinja();

         */
        //sobrescrevendo o método da interface  em uma classe abstrata
        @Override
         public void estrategiaNinja(){
                 System.out.println("Essa é minha estratégia de combate ");
         }

        public Ninja() {
        }

        public Ninja(String nome, String aldeia, int idade) {
                this.nome = nome;
                this.aldeia = aldeia;
                Idade = idade;
        }
}
