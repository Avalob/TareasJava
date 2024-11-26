    //2. Pedir dos números y decir si uno es múltiplo del otro.

import java.util.Scanner;

public class Tarea4if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Introduzca el primer número:");
        numero1= sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        numero2= sc.nextInt();
        if (numero2 % numero1 == 0) {
            System.out.println("El número "+ numero1+ " es múltiplo de " +numero2);
        } else {System.out.println("El número "+ numero1+ " no es múltiplo de " +numero2);
            
        }
    }
}
