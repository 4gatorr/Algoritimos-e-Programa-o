/*
Faça um algoritmo que leia um inteiro entre 1 e 12;
imprima o nome do mês por extenso.
*/
//Feito por: Heitor Soares da Silva
package Exercicios3;
import java.util.Scanner;

public class Exercicio2 {
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
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11");
        System.out.println("12");
        int numero = entrada.nextInt();

        switch(numero){
            case 1: 
                System.out.println("Janeiro");
            break;
            case 2:
                System.out.println("Fevereiro");
            break;
            case 3: 
                System.out.println("Março");   
            break;
            case 4:
                System.out.println("Abril");
            break;
            case 5:
                System.out.println("Maio");
            break;
            case 6:
                System.out.println("Junho");
            break;
            case 7:
                System.out.println("Julho");
            break;  
            case 8:
                System.out.println("Agosto");
            break;
            case 9:
                System.out.println("Setembro");
            break;
            case 10:
                System.out.println("Outubro");
            break;
            case 11:
                System.out.println("Novembro");
            break; 
            case 12:
                System.out.println("Dezembro");
            break; 
            
            default:
                System.out.println("Numero invalido");
        }
        entrada.close();
        
    }
}
