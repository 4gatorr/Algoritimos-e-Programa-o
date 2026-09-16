package Exercicios3;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero desejado");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        int numero = entrada.nextInt();

        switch(numero){
            case 1: 
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Segunda-feira");
            break;
            case 3: 
                System.out.println("Terça-feira");   
            break;
            case 4:
                System.out.println("Quarta-feira");
            break;
            case 5:
                System.out.println("Quinta-feira");
            break;
            case 6:
                System.out.println("Sexta-feira");
            break;
            case 7:
                System.out.println("Sabado");
            break;  
            
            default:
                System.out.println("Numero invalido");
        
        }
        
    }
}
