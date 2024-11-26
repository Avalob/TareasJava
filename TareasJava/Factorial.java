import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        double factorial = 1;

            System.out.print("Introduce un numero entero mayor o igual a 0: ");
            Scanner dato=new Scanner(System.in);
            int n =dato.nextInt();
        while (n < 0);
        
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		
        //mostrar el resultado
        System.out.printf("El factorial de "+n+ " es "+ factorial);                                                         
    }
}