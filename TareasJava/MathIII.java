/*Ejercicio 1 */
import java.util.Scanner;

public class MathIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
            System.out.print("Introduzca el número de segundos: ");
            int segundos = sc.nextInt();
            
            System.out.println("El minuto es el " + (int)(Math.ceil(segundos / 60.0)));
            System.out.print("¿Otro valor (s/n)? ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));
        sc.close();
    }
}

