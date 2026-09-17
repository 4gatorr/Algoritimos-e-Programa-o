import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        int par = 0;
        int resto;


        while(contador < 10){
            contador++;
        System.out.println("Digite o numero "+ contador);
        int numero = entrada.nextInt();

         resto = contador % 2;
         if(resto == 0){
            System.out.println("Quantidade de par ");
         }else{

         }
        }
    }
}
