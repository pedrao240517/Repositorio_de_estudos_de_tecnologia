package NivelIntermediario.Desafios.Desafio03;

public  abstract class  ContaBancaria implements Conta {

    double saldo;
    


   @Override
    public abstract void depositar(double valor);

   @Override
   public  abstract void consultarSaldo();
       



    

}
