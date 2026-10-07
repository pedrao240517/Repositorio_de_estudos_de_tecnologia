package exercicioNoCodigoJava.iniciante.escopoDeVariaveis;

public class escopoDoMetodo {
    String nomeEmpresa = "techCorp";


    public void exibirdados(){
        String nomeFuncionario = "Carlos";
        System.out.println(nomeFuncionario);
        System.out.println(nomeEmpresa);
    }
    public void tentaracessar() {
        //        System.out.println(nomeFuncionario);
        System.out.println(" System.out.println(nomeFuncionario);"+"colocar variavel de um método em outro vai dar erro animal");
    }

    static void main(String[] args) {
        escopoDoMetodo obj = new escopoDoMetodo();
        obj.exibirdados();
        obj.tentaracessar();





    }
}
