package Exercicios3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o periodo que voce estuda");
        System.out.println("M - Matutino");
        System.out.println("v - Vespertino");
        System.out.println("N - Noturno");
        String letra = entrada.nextLine();

        switch (letra) {
            case "M":
                System.out.println("Bom Dia");                
                break;
            case "V":
                    System.out.println("Boa Tarde");                
                break;
            case "N":
                System.out.println("Boa Noite");                
                break;
            default:
                System.out.println("Invalido");
        }        
    }
}
