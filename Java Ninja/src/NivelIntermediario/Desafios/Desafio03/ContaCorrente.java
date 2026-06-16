package NivelIntermediario.Desafios.Desafio03;

public class ContaCorrente extends ContaBancaria {
    static void main(String[] args) {




        
        ContaBancaria contaCorrente = new ContaCorrente();
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();




        
    }

    @Override
    public void depositar(double valor) {
        saldo =saldo + valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + "R$"+ );
    }
}
