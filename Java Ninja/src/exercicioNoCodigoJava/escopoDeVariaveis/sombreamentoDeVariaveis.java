package exercicioNoCodigoJava.escopoDeVariaveis;

public class sombreamentoDeVariaveis {
    int numero = 18;
    public void mostrarNumero(){
        int numero =50;
        System.out.println("varivel local (pois está localmente no metódo) "+numero);
        System.out.println("variavel globa(pois pode ser acessada de qualquer classe do código): "+this.numero);
    }

    static void main(String[] args) {
        sombreamentoDeVariaveis teste = new sombreamentoDeVariaveis();
        teste.mostrarNumero();

    }
}
