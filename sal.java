public class sal {
    public static void main (String [] args){
        int contador = 0;
        int acumulador = 1;

        while (contador <= 100){
            acumulador = acumulador + contador;
            contador++;
        }System.out.println("O somatorio de 0 a 100 é: "+ acumulador);
    }
}