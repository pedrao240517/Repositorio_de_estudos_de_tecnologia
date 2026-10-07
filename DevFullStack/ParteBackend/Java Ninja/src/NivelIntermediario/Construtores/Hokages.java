package NivelIntermediario.Construtores;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    int  altura;

    // normalmente você usa apenas um construtor com todos os argumentos e um vazio.
    // criar todos os construtores automaticamente
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }


            public Hokages(){
                //Construtor vazio sem argumento


            }


    public Hokages(String nome){
        //Construtor vazio com argumento
        this.nome = nome;
        


    }

    public Hokages(int idade){
        this.idade= idade;
    }
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome= nome;
        this.idade= idade;
        this.vivoOuNao= vivoOuNao;
        

    }

    public abstract void sabedoria();




}
