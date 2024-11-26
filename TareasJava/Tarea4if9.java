//Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
//introducidos.

import java.util.Scanner;

public class Tarea4if9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int suma =0;
        while (numero!=0) {
            suma+= numero;
        System.out.println("Inserte un número:");
        numero = sc.nextInt();
            System.out.println("La suma es " +suma );
        }
        System.out.println("Has ganado");
    }
}
