package Exercicios3;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int operacao;

        System.out.println("Digite a operação desejada");
        System.out.println("M - Média dos numeros");
        System.out.println("S - Diferença do maior para o menor");
        System.out.println("P - O produto entre eles");
        System.out.println("D - A divisão do primeiro pelo segundo");
        String letra = entrada.nextLine();
        
        System.out.println("Digite o primeiro numero");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = entrada.nextInt();

        switch (letra) {
            case "M":
                operacao = (num1 + num2) / 2;
                System.out.println("A media dos numeros é "+ operacao);
            break;
            case "S":
                if(num1 > num2){
                    System.out.println("O numero 1 é maior que o numero 2");
                }else{
                    System.out.println("O numero 2 é maior que o nuemro 1");
                }
            break;
            case "P":
                operacao = num1 * num2;
                System.out.println("O produto dos numeros é "+ operacao);
            break;
            case "D":
                operacao = num1 / num2;
                System.out.println("A divisão do 1 pelo 2 é "+ operacao);
            break;
        }
        entrada.close();        
    }    
}