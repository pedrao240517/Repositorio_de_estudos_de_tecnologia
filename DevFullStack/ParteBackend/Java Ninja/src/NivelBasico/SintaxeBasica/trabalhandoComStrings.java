package NivelBasico.SintaxeBasica;

public class trabalhandoComStrings {
    public static void main(String[] args) {

    String nome1 = "Pedro";
    String nome2 = "Ana";
    int tamanho =nome1.length();
    boolean iguais =nome2.equals(nome1);

    System.out.println("Olá " + nome1);
    System.out.println("Tamanho do nome "+tamanho);
    System.out.println("Olá "+ nome2.toUpperCase());
    System.out.println("Nomes são iguais: "+iguais);




    }
}
