package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {


    Ninja cadastro = new Ninja("Naruto","naruto@email.com",99999999);
        System.out.println("Cadastro: "+cadastro);
        System.out.println("Nome: "+cadastro.getNome());






    NinjaRecord record = new NinjaRecord("sasuke","sasuke@email.com",99999999);
        System.out.println("Cadastro: "+record.emailCaixaAlta());
        System.out.println("Cadastro "+record.nome());



    }
}
