package NivelBasico.Condicionais;
import java.util.Scanner;

public class EstudoSwitchcase {
    static void main(String[] args) {


        /*
        *Switch cases: que servem para gerar casos especificos
        * objetivo; pedir pro usuário escolher o ninja
        *
         */

            //Mostrar opções pro usuário
            Scanner caixadetexto = new Scanner(System.in);
            System.out.println("Escolha um personagem: ");
            System.out.println("1) Naruto Uzumaki");
            System.out.println("2) Sasuke Uchicha");
            System.out.println("3) Sakura Haruno");

            // Pedir pro usuario escolher
            int escolhaDoUsuario =caixadetexto.nextInt();
            System.out.println("Você escolheu o personagem " + escolhaDoUsuario);

            // Reação ao escolher o usuário
            switch (escolhaDoUsuario) {
                case 1:
                    System.out.println("O Usuário escolheu o Naruto Uzumaki");
                    break;
                case 2:
                    System.out.println("O Usuário escolheu o Sasuke Uchicha");
                    break;
                case 3:
                    System.out.println("O Usuário escolheu a Sakura Haruno");
                    break;
                default:
                    System.out.println("Você é burro? e pra escolher de 1 a 3, tente de novo");
                    break;

            }

            // Fechar a caixa
            caixadetexto.close();







    }
}
