//3. Pedir dos números y decir cual es el mayor o si son iguales.
import java.util.Scanner;
public class Tarea4if3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        int numero2 =sc.nextInt();
        if (numero1 > numero2) { 
            System.out.println("El número "+ numero1 +" es mayor que el número "+numero2);
        } else {if (numero1 < numero2) {
            System.out.println("El número "+ numero1 +" es menor que el número "+numero2);
        } else {System.out.println("El número "+numero1+" y el número "+ numero2+" son iguales.");
            
        }
            
        }

    }
    
}
