/*
Dado o cardápio de uma 	lanchonete:
Faça um algoritmo que:
leia o código do produto e a quantidade;
calcule o valor a ser pago pelo cliente;
imprimir o valor a ser pago;
imprimir o nome do produto.
*/
//Feito por: Heitor Soares da Silva
package Exercicios3;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Double valor;
        System.out.println("Cardapio:");
        System.out.println("100 - Cachorro-Quente: R$ 1,20");
        System.out.println("101 - Bauru Simples: R$ 1,30");
        System.out.println("102 - Bauru com Ovo: R$ 1,50");
        System.out.println("103 - Hamburguer: R$ 1,20");
        System.out.println("104 - Cheeseburguer: R$ 1,40");
        System.out.println("105 - Refrigerante: R$ 1,00");
        int codigo = entrada.nextInt();

        System.out.println("Qual a quantidade?");
        int quant = entrada.nextInt();

        switch (codigo) {
            case 100:
                valor = quant * 1.20;  
                System.out.println("Cachorro-Quente");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 101:
                valor = quant * 1.30;  
                System.out.println("Bauru Simples");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 102:
                valor = quant * 1.20;  
                System.out.println("Bauru com Ovo");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 103:
                valor = quant * 1.20;  
                System.out.println("Hamburguer");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 104:
                valor = quant * 1.30;  
                System.out.println("Cheeseburguer");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 105:
                valor = quant * 1.00;  
                System.out.println("Refrigerante");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            default:
                throw new AssertionError();
        }
    }
}