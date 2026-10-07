package NivelIntermediario.codigopronto.getters_e_setters;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int missoesconcluidas;
    private double  altura = 2.10;

    // construtor allargs
    public Ninja(String nome, String aldeia, int idade, int missoesconcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.missoesconcluidas = missoesconcluidas;
        this.altura = altura;
    }
    
    // construtor noArgs
    public Ninja() {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public int getMissoesconcluidas() {
        return missoesconcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMissoesconcluidas(int missoesconcluidas) {
        this.missoesconcluidas = missoesconcluidas;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /*
    
    //tirar dados ou mostrar ao usuario eu uso o GET + nome da variável

    public String getNome(){
        return nome;
    }

    //SETTER RECEBE VALORES         
    public void setNome(String nome){
        this.nome = nome;
    }
    

    // Get e set do atributo altura
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

     */
    
    
}
