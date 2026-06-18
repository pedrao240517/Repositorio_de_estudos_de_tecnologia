package NivelIntermediario.POObasicoeOutros;

public class Ninja {
        String nome;
        String aldeia;
        int idade;



        /*
        // Criar método Público personalizado
        // VOID - não retorna valor nenhum
        public  void  ShariganAtivado (){
                System.out.println("O sharigam ativado, eu sou um uchiha");
        }
        */


        /*
        // Método String ter que retornar uma string
        // Método int ter que retornar umint
         */
        public String EuSouUmNinja (){
                return "Oi, eu sou um ninja";
        }

        public int TempoHokage (int idadeMinima){
                return idadeMinima - idade;
        }

        
        // Todo ninja vai fazer obrigatoriamente
         final void tacarkunai (){
                System.out.println("Eu sou um metódo da classe filha");
        }


    
}
