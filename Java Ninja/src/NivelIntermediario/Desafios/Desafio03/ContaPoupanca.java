package NivelIntermediario.Desafios.Desafio03;

public class ContaPoupanca extends ContaBancaria{
    static void main(String[] args) {

        ContaBancaria contapoupanca = new ContaPoupanca();
        contapoupanca.depositar(50);
        contapoupanca.consultarSaldo();


    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando um valor para conta poupança de "+valor+ " com uma taxa de 1$ deduzido");
        saldo =saldo + valor -  (valor*0.1);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + "R$"+saldo);
    }
}
