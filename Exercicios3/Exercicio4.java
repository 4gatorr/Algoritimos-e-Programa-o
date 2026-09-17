/*
Um funcionário receberá aumento de acordo com seu plano de 	trabalho.
Faça um algoritmo que leia:
o plano de trabalho;
e o salário atual de um funcionário;
Calcule e imprima o seu novo salário.
*/
//Feito por: Heitor Soares da Silva
package Exercicios3;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        Double calculo;
        System.out.println("Digite seu plano de trabalho");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        String letra = entrada.nextLine();

        System.out.println("Digite seu salario");
        Double salario = entrada.nextDouble();



        switch (letra) {
            case "A":
                calculo = (salario * 0.10) + salario;
                System.out.println("Seu novo salario é "+ calculo);               
                break;
            case "B":
                calculo = (salario * 0.15) + salario;
                System.out.println("Seu novo salario é "+ calculo);               
                break;
            case "C":
                calculo = (salario * 0.20) + salario;
                System.out.println("Seu novo salario é "+ calculo);               
                break;
            default:
                throw new AssertionError();
        }
    }
}
